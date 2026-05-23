package com.example.fort.FortProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fort.FortProject.entity.ContactMessage;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}