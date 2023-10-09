package com.example.booking.persist.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "CUSTOMER")
@Getter
@ToString
@NoArgsConstructor
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;    //CUSTOMER ID

    @Column
    private String name;    //CUSTOMER NAME
}
