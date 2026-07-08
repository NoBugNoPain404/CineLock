package com.example.cine_management.repository;

import com.example.cine_management.entity.City;
import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

    @NonNull Optional<City> findById(@NonNull Integer id);

    @NonNull List<City> findAll();
}
