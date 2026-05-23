package com.example.fort.FortProject.service;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.example.fort.FortProject.dto.ContactRequest;
import com.example.fort.FortProject.entity.ContactMessage;
import com.example.fort.FortProject.repo.ContactMessageRepository;

@Service
public class ContactService {

    private final ContactMessageRepository repository;

    public ContactService(ContactMessageRepository repository) {
        this.repository = repository;
    }

    public void saveMessage(ContactRequest request) {

        ContactMessage message = new ContactMessage();
        message.setName(request.getName());
        message.setEmail(request.getEmail());
        message.setMessage(request.getMessage());
        message.setCreatedAt(LocalDateTime.now());
        repository.save(message);
    }
}