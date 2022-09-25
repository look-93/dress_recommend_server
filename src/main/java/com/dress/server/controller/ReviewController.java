package com.dress.server.controller;

import com.dress.server.dto.*;
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

        return ResponseEntity.ok().body(review);
    }

    @GetMapping("/myresult/{upk}")
    public ResponseEntity getMyResultByPk(@PathVariable int upk){
        List review = reviewService.getMyResultByPk(upk);
        //System.out.println(review);
        return ResponseEntity.ok().body(review);
    }

    @DeleteMapping("deleteMyResultByPk/{rPk}")
    public ResponseEntity deleteMyResultByPk(@PathVariable int rPk){
        reviewService.deleteMyResultByPk(rPk);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/myReview")
    public ResponseEntity myReview (@RequestBody UsedReview usedReview){
        reviewService.myReview(usedReview);
        //System.out.println(usedReview);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/allUsedReview/{uPk}")
    public ResponseEntity getAllUsedReview(@PathVariable int uPk){
       List allUsedReview = reviewService.getAllUsedReview(uPk);
       return ResponseEntity.ok().body(allUsedReview);
    }

    @GetMapping("/getUsedReviewByPk/{urPk}")
    public ResponseEntity getUsedReviewByPk(@PathVariable int urPk){
        UsedReview review = reviewService.getUsedReviewByPk(urPk);
        return ResponseEntity.ok().body(review);
    }

    @GetMapping("/getUsedReviewByRpk/{rPk}")
    public ResponseEntity getUsedReviewByRpk(@PathVariable int rPk){
        UsedReview review = reviewService.getUsedReviewByRpk(rPk);
        return ResponseEntity.ok().body(review);
    }

    @PostMapping("/editReview")
    public ResponseEntity editReview(@RequestBody UsedReview usedReview){
        reviewService.editReview(usedReview);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/addComment")
    public ResponseEntity addComment(@RequestBody Comment comment){
        reviewService.addComment(comment);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/comment/{urPk}")
    public ResponseEntity comment(@PathVariable int urPk){
        List<Comment> comments= reviewService.getUsedReviewComment(urPk);
        return ResponseEntity.ok().body(comments);
    }

    @PostMapping("/star")
    public ResponseEntity addStar(@RequestBody Star star){
        reviewService.addStar(star);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/star/{sPk}")
    public ResponseEntity deleteStar(@PathVariable int sPk){
        System.out.println(sPk);
        System.out.println("gdd");
        reviewService.deleteStar(sPk);
        return ResponseEntity.ok().build();
    }

}
