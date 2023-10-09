package com.example.booking.web;

import com.example.booking.persist.entity.ReviewEntity;
import com.example.booking.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    /**
     * 리뷰리스트 조회
     *
     */
    @GetMapping
    public ResponseEntity<?> showReviews() {
        List<ReviewEntity> reviewEntities = this.reviewService.showReviews();
        return ResponseEntity.ok(reviewEntities);
    }

    /**
     * 리뷰 남기기
     *
     *
     */
    @PostMapping
    public ResponseEntity<?> addReview(@RequestBody ReviewEntity reviewEntity) {
        this.reviewService.addReview(reviewEntity);
        return ResponseEntity.ok(reviewEntity);
    }

    /**
     * 리뷰 삭제
     *
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteReview(@PathVariable Long id) {
        this.reviewService.cancelReview(id);
        return ResponseEntity.ok("No." + id + " review is canceled");
    }
}
