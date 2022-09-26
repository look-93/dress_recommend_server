package com.dress.server.mapper;

import com.dress.server.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {

     void addReview(Review review);
     List<Review> getAllReview();
     Review getReviewByPk(int rPk);
     List<Review> getMyResultByPk(int upk);
     void deleteMyResultByPk(int rPk);

     void myReview(UsedReview usedReview);

     List<UsedReview> getAllUsedReview();

     UsedReview getUsedReviewByPk(int urPk);

     UsedReview getUsedReviewByRpk(int rPk);

     void editReview(UsedReview usedReview);

     void addComment(Comment comment);
     List<Comment> getUsedReviewComment(int urPk);

     void addStar(Star star);

     void deleteStar(int sPk);

     List<Star> getStar(int uPk);

     List<UsedReview> getAllMyStar(int uPk);

     void addHeart(Heart heart);

     void deleteHeart(int hPk);

     List<Heart> getHeart(int uPk);

     List<Heart> getHeartCnt(int rPk);


}
