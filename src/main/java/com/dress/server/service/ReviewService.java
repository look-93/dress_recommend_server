package com.dress.server.service;


import com.dress.server.dto.Review;

import java.util.List;

public interface ReviewService {

     void addReview(Review review);

     List<Review> getAllReview();

     Review getReviewByPk(int rPk);

     List<Review> getMyResultByPk(int upk);

     void deleteMyResultByPk(int rPk);

}
