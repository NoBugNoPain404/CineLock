package com.example.cine_management.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "movie_actor", schema = "cine_management")
@Data
public class MovieActor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

    @Column(name = "character")
    private String character;
}
