package com.example.booking.persist.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity(name = "BOOKING")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private long booking_id;    //BOOKING ID

    @Column
    private String phoneNumber;    //BOOKING PHONE NUMBER (CUSTOMER'S)

    @Column
    private boolean isArrivedStatus;    //true: ARRIVED

    @CreatedDate
    @Column(name = "booking_time")
    private LocalDateTime createdAt = LocalDateTime.now();  //BOOKING TIME

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_AT")
    private LocalDateTime modifiedAt;

//    @OneToMany(mappedBy = "bookingEntity", fetch = FetchType.LAZY, orphanRemoval = true)
//    private List<ReviewEntity> reviews;
}
