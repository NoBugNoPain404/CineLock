package com.example.cine_management.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "movie_company", schema = "cine_management")
@Data
public class MovieCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private Movie movie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private ProductCompany productCompany;
}
