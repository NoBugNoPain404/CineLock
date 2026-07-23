package com.example.cine_management.service;

import com.example.cine_management.common.ApiResponse;
import com.example.cine_management.pojo.MovieDetailDto;
import com.example.cine_management.service.cache.MovieCacheService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieCacheService movieCacheService;

    public ApiResponse<MovieDetailDto> getMovieDetail(Integer id) {
        MovieDetailDto movieDetail = movieCacheService.getMovieDetail(id);

        return ApiResponse.<MovieDetailDto>success(
                201,
                movieDetail,
                "Get movie detail successfully"
        );
    }
}
