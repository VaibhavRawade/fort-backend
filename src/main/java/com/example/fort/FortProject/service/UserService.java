package com.example.fort.FortProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fort.FortProject.config.InvalidCredentialsException;
import com.example.fort.FortProject.config.ResourceAlreadyExistsException;
import com.example.fort.FortProject.config.ResourceNotFoundException;
import com.example.fort.FortProject.dto.LoginRequest;
import com.example.fort.FortProject.dto.RegisterRequest;
import com.example.fort.FortProject.entity.User;
import com.example.fort.FortProject.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // ✅ REGISTER
    public void register(RegisterRequest request) {

        // Email already exists
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new ResourceAlreadyExistsException("Email already registered");
        }

        // Password validation (6 digits only)
        if (!request.getPassword().matches("\\d{6}")) {
            throw new IllegalArgumentException("Password must be exactly 6 digits");
        }

        User user = new User();
        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        userRepository.save(user);
    }

    // ✅ LOGIN
    public User login(LoginRequest request) {

        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new InvalidCredentialsException("Invalid email or password"));

        if (!user.getPassword().equals(request.getPassword())) {
            throw new InvalidCredentialsException("Invalid email or password");
        }

        return user;
    }

    // ✅ GET USER (Example for 404 usage)
    public User getUserById(Long id) {

        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }
}