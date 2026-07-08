package com.example.cine_management.pojo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ActiveCinemaDTO {

    private Integer id;

    private String name;

    private String address;

    private Integer city;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private String phone;

    private String email;

    private String image;
}
