package com.example.cine_management.controller;

import com.example.cine_management.common.ApiResponse;
import com.example.cine_management.pojo.ActiveCinemaDto;
import com.example.cine_management.service.CinemaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cinema")
public class CinemaController {

    private final CinemaService cinemaService;

    @GetMapping("/activeCinema")
    public ResponseEntity<ApiResponse<List<ActiveCinemaDto>>> getActiveCinema() {
        return ResponseEntity.ok(
                cinemaService.getActiveCinema()
        );
    }
}
