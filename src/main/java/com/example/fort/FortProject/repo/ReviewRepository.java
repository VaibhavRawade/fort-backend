package com.example.fort.FortProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fort.FortProject.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}