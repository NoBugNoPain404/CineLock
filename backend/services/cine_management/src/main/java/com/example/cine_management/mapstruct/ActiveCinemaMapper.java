package com.example.cine_management.mapstruct;

import com.example.cine_management.entity.Cinema;
import com.example.cine_management.pojo.ActiveCinemaDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ActiveCinemaMapper {

    @Mapping(target = "name", source = "cinema.name")
    @Mapping(target = "address", source = "cinema.address")
    @Mapping(target = "city", source = "cinema.city.id")
    @Mapping(target = "latitude", source = "cinema.latitude")
    @Mapping(target = "longitude", source = "cinema.longitude")
    @Mapping(target = "phone", source = "cinema.phone")
    @Mapping(target = "email", source = "cinema.email")
    @Mapping(target = "image", source = "cinema.image")
    ActiveCinemaDTO cinemaToActiveCinema(Cinema cinema);
}
