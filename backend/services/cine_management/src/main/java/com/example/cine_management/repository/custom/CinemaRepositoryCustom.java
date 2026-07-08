package com.example.cine_management.repository.custom;

import com.example.cine_management.entity.Cinema;

import java.util.List;

public interface CinemaRepositoryCustom {
    List<Cinema> findAllActiveCinema();
}
