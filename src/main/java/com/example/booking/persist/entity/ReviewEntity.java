package com.example.booking.persist.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "REVIEW")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long review_id; //리뷰 아이디

    private String store_Name;

    private int review_startPoint;  // 별점 : 1 ~ 5 점

    private String review_comment;  //리뷰 내용

    @Column(name = "review_date")
    @CreatedDate
    private LocalDateTime createdAt = LocalDateTime.now(); //REVIEW POSTED DATE

//    @ManyToOne
//    @JoinColumn(name = "id")
//    private BookingEntity bookingEntity;
}
