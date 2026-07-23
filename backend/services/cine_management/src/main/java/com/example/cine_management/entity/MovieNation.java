package com.example.cine_management.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "movie_nation", schema = "cine_management")
@Data
public class MovieNation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nation_id", referencedColumnName = "id")
    private Nation nation;
}
