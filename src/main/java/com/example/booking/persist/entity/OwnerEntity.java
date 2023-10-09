package com.example.booking.persist.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "OWNER")
@Getter
@ToString
@NoArgsConstructor
public class OwnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;    //OWNER ID

    @Column
    private String name;    //OWNER NAME
}
