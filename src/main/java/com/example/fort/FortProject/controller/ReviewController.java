package com.example.fort.FortProject.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fort.FortProject.dto.ReviewRequest;
import com.example.fort.FortProject.entity.Review;
import com.example.fort.FortProject.service.ReviewService;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin("*")
public class ReviewController
{

    private final ReviewService service;

    public ReviewController(ReviewService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> createReview(@RequestBody ReviewRequest request) {
        service.saveReview(request);
        return ResponseEntity.ok("Review added successfully");
    }

    @GetMapping
    public ResponseEntity<List<Review>> getReviews() 
    {
        return ResponseEntity.ok(service.getAllReviews());
    }
}