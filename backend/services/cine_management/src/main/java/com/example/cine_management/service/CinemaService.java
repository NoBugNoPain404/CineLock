package com.example.cine_management.service;

import com.example.cine_management.common.ApiResponse;
import com.example.cine_management.pojo.ActiveCinemaDto;
import com.example.cine_management.service.cache.CinemaCacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class    CinemaService {

    private final CinemaCacheService cinemaCacheService;

    public ApiResponse<List<ActiveCinemaDto>> getActiveCinema() {
        return ApiResponse.success(
                201,
                cinemaCacheService.getActiveCinema(),
                "Get active cinema list successfully"
        );
    }
}
