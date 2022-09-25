package com.dress.server.service;


import com.dress.server.dto.Comment;
import com.dress.server.dto.Review;
import com.dress.server.dto.Star;
import com.dress.server.dto.UsedReview;

import java.util.List;

public interface ReviewService {

     void addReview(Review review);

     List<Review> getAllReview();

     Review getReviewByPk(int rPk);

     List<Review> getMyResultByPk(int upk);

     void deleteMyResultByPk(int rPk);

     void myReview(UsedReview usedReview);

     List<UsedReview> getAllUsedReview(int uPk);

     UsedReview getUsedReviewByPk(int urPk);

     UsedReview getUsedReviewByRpk(int rPk);

     void editReview(UsedReview usedReview);

     void addComment(Comment comment);

     List<Comment> getUsedReviewComment(int urPk);

     void addStar(Star star);
     void deleteStar(int sPk);
}
