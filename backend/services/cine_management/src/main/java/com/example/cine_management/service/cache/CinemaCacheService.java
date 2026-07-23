package com.example.cine_management.service.cache;

import com.example.cine_management.entity.Cinema;
import com.example.cine_management.mapstruct.ActiveCinemaMapper;
import com.example.cine_management.pojo.ActiveCinemaDto;
import com.example.cine_management.repository.CinemaRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CinemaCacheService {

    private final CinemaRepository cinemaRepository;

    @Cacheable(value = "cinema")
    public List<Cinema> getAll() {
        return cinemaRepository.findAll();
    }

    @Cacheable(value = "activeCinema")
    public List<ActiveCinemaDto> getActiveCinema() {
        List<Cinema> cinemas = cinemaRepository.findAllActiveCinema();
        return cinemas.stream()
                .map(ActiveCinemaMapper.INSTANCE::cinemaToActiveCinema)
                .toList();
    }
}
