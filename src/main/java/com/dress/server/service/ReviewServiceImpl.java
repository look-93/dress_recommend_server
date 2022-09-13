package com.dress.server.service;

import com.dress.server.dto.Review;
import com.dress.server.mapper.ReviewMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    ReviewMapper reviewMapper;
    

    public ReviewServiceImpl(ReviewMapper reviewMapper){this.reviewMapper = reviewMapper;}

    @Override
    public void addReview(Review review) {
        reviewMapper.addReview(review);
    }

    @Override
    public List<Review> getAllReview() {
        return reviewMapper.getAllReview();
    }

    @Override
    public Review getReviewByPk(int rPk) {
        return reviewMapper.getReviewByPk(rPk);
    }
}
