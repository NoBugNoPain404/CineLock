package com.example.cine_management.repository;

import com.example.cine_management.entity.Cinema;
import com.example.cine_management.repository.custom.CinemaRepositoryCustom;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@NullMarked
public interface CinemaRepository extends
        JpaRepository<Cinema, Integer>,
        CinemaRepositoryCustom {
    List<Cinema> findAll();
}
