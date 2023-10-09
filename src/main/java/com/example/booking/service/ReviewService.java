package com.example.booking.service;

import com.example.booking.persist.BookingRepository;
import com.example.booking.persist.ReviewRepository;
import com.example.booking.persist.entity.BookingEntity;
import com.example.booking.persist.entity.ReviewEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepository;

    public List<ReviewEntity> showReviews(){
        return this.reviewRepository.findAll();
    }

    public ReviewEntity addReview(ReviewEntity reviewEntity){
        return this.reviewRepository.save(reviewEntity);
    }

    public void cancelReview(Long id) {
        this.reviewRepository.deleteById(id);
    }
}
