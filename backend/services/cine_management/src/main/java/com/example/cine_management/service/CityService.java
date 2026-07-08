package com.example.cine_management.service;

import com.example.cine_management.common.ApiResponse;
import com.example.cine_management.entity.City;
import com.example.cine_management.service.cache.CityCacheService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CityService {

    private final CityCacheService cityCacheService;

    public ApiResponse<List<City>> getAll() {
        return ApiResponse.<List<City>>builder()
                .httpCode(201)
                .data(cityCacheService.findAllCity())
                .build();
    }
}
