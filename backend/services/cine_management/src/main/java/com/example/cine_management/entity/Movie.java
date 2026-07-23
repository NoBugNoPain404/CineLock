package com.example.cine_management.entity;

import com.example.cine_management.enums.AgeRatings;
import com.example.cine_management.enums.MovieStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "movie", schema = "cine_management")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "age_ratings")
    @Enumerated(EnumType.STRING)
    private AgeRatings ageRatings;

    @Column(name = "banner")
    private String banner;

    @Column(name = "trailer")
    private String trailer;

    @Column(name = "rates")
    private Float rates;

    @Column(name = "votes")
    private Integer votes;

    @Column(name = "vote_sum")
    private Integer voteSum;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private MovieStatus status;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;
}
