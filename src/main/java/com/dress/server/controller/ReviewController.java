package com.dress.server.controller;

import com.dress.server.dto.Review;
import com.dress.server.dto.User;
import com.dress.server.service.ReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import java.util.List;

@RequestMapping("/review")
@RestController
public class ReviewController {

    ReviewService reviewService;

    public ReviewController(ReviewService reviewService){this.reviewService = reviewService;}

    @PostMapping("/review")
    public ResponseEntity review(@RequestBody Review review ){

        //System.out.println(review);
        reviewService.addReview(review);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all")
    public ResponseEntity allReview(){
        List reviews = reviewService.getAllReview();
        //System.out.println(reviews);

        return ResponseEntity.ok().body(reviews);
    }

    @GetMapping("/{rPk}")
    public ResponseEntity getReviewByPk(@PathVariable int rPk){
        Review review =  reviewService.getReviewByPk(rPk);
        //System.out.println(review);
        return ResponseEntity.ok().body(review);
    }
}
