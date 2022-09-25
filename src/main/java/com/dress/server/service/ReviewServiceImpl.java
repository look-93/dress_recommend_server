package com.dress.server.service;

import com.dress.server.dto.Comment;
import com.dress.server.dto.Review;
import com.dress.server.dto.Star;
import com.dress.server.dto.UsedReview;
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

    @Override
    public List<Review> getMyResultByPk(int upk) {
        return reviewMapper.getMyResultByPk(upk);
    }

    @Override
    public void deleteMyResultByPk(int rPk) {
        reviewMapper.deleteMyResultByPk(rPk);
    }

    @Override
    public void myReview(UsedReview usedReview) {
        reviewMapper.myReview(usedReview);
    }

    @Override
    public List<UsedReview> getAllUsedReview(int uPk) {
        List<Star> stars =  reviewMapper.getStar(uPk);
        List<UsedReview> usedReviews = reviewMapper.getAllUsedReview();
        for(int i=0; i<usedReviews.size(); i++){
            UsedReview usedReview = usedReviews.get(i);
            for(int j=0; j<stars.size(); j++){
                Star star = stars.get(j);
                if(usedReview.getRPk() == star.getRPk()){
                    usedReview.setSPk(star.getSPk());
                }
            }
        }
        return usedReviews;
    }

    @Override
    public UsedReview getUsedReviewByPk(int urPk) {
        return reviewMapper.getUsedReviewByPk(urPk);
    }

    @Override
    public UsedReview getUsedReviewByRpk(int rPk) {
        return reviewMapper.getUsedReviewByRpk(rPk);
    }

    @Override
    public void editReview(UsedReview usedReview) {
        reviewMapper.editReview(usedReview);
    }

    @Override
    public void addComment(Comment comment) {
        reviewMapper.addComment(comment);
    }

    @Override
    public List<Comment> getUsedReviewComment(int urPk) {
        return reviewMapper.getUsedReviewComment(urPk);
    }

    @Override
    public void addStar(Star star) {
        reviewMapper.addStar(star);
    }

    @Override
    public void deleteStar(int sPk){
        reviewMapper.deleteStar(sPk);
    }

}
