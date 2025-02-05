package com.example.springboot.springbootlibrary.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "Review")
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;


    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "date")
    private Date date;

    @Column(name = "rating")
    private double rating;

    @Column(name = "book_id")
    private long bookId;

    @Column(name = "review_description")
    private String reviewDescription;


}
