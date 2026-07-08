package com.example.cine_management.controller;

import com.example.cine_management.common.ApiResponse;
import com.example.cine_management.entity.City;
import com.example.cine_management.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
public class CityController {

    private final CityService cityService;

    @GetMapping("/all")
    public ResponseEntity<Object> getAll() {
        ApiResponse<List<City>> response = cityService.getAll();

        return ResponseEntity.ok(
                response
        );
    }
}
