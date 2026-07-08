package com.example.cine_management.service.cache;

import com.example.cine_management.entity.City;
import com.example.cine_management.repository.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityCacheService {

    private final CityRepository cityRepository;

    @Cacheable(value = "cities")
    public List<City> findAllCity() {
        return cityRepository.findAll();
    }
}
