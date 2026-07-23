package com.example.cine_management.mapstruct;

import com.example.cine_management.entity.Cinema;
import com.example.cine_management.pojo.ActiveCinemaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ActiveCinemaMapper {

    ActiveCinemaMapper INSTANCE = Mappers.getMapper( ActiveCinemaMapper.class);

    @Mapping(target = "name", source = "cinema.name")
    @Mapping(target = "address", source = "cinema.address")
    @Mapping(target = "city", source = "cinema.city.id")
    @Mapping(target = "latitude", source = "cinema.latitude")
    @Mapping(target = "longitude", source = "cinema.longitude")
    @Mapping(target = "phone", source = "cinema.phone")
    @Mapping(target = "email", source = "cinema.email")
    @Mapping(target = "image", source = "cinema.image")
    ActiveCinemaDto cinemaToActiveCinema(Cinema cinema);
}
