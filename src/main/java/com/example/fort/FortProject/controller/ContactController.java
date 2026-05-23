package com.example.fort.FortProject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fort.FortProject.dto.ContactRequest;
import com.example.fort.FortProject.service.ContactService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin("*")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody ContactRequest request) {

        service.saveMessage(request);

        return ResponseEntity.ok("Message sent successfully");
    }
}