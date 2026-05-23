package com.example.fort.FortProject.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.fort.FortProject.dto.ReviewRequest;
import com.example.fort.FortProject.entity.Review;
import com.example.fort.FortProject.repo.ReviewRepository;

@Service
public class ReviewService {

    private final ReviewRepository repository;

    public ReviewService(ReviewRepository repository) 
    {
        this.repository = repository;
    }

    public void saveReview(ReviewRequest request) 
    {
        Review review = new Review();
        review.setName(request.getName());
        review.setRating(request.getRating());
        review.setText(request.getText());

        repository.save(review);
    }

    public List<Review> getAllReviews()
    {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
    }
}