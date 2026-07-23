package com.example.cine_management.entity;

import com.example.cine_management.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(schema = "cine_management", name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "image")
    private String image;

    @Column(name = "note")
    private String note;

    @Column(name = "created_at")
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;
}
