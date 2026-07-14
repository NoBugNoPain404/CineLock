package com.example.cine_management.service;

import com.example.cine_management.common.ApiResponse;
import com.example.cine_management.pojo.ActiveCinemaDTO;
import com.example.cine_management.service.cache.CinemaCacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class    CinemaService {

    private final CinemaCacheService cinemaCacheService;

    public ApiResponse<List<ActiveCinemaDTO>> getActiveCinema() {
        return ApiResponse.success(
                201,
                cinemaCacheService.getActiveCinema(),
                "Get active cinema list successfully"
        );
    }
}
