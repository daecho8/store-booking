package com.example.booking.persist.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "STORES")
@Getter
@ToString
@NoArgsConstructor
@EntityListeners(value = AuditingEntityListener.class)
public class StoreInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private long store_id;    //STORE ID
//
//    @OneToOne
//    @PrimaryKeyJoinColumn(name = "store_id")
//    private BookingEntity bookingEntity;

    @Column
    private String store_name;    //STORE NAME

    @Column
    private String location; //STORE ADDRESS

    @Column
    private String description; //STORE DESCRIPTION

    @Column(name = "registered_date")
    @CreatedDate
    private LocalDate createdAt; //STORE REGISTERED DATE
}
