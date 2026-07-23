package com.example.cine_management.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
import java.util.Set;

@Entity
@Data
@Table(name = "genre", schema = "cine_management")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;
}
