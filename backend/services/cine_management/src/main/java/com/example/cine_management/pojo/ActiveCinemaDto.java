package com.example.cine_management.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActiveCinemaDto {

    private String name;

    private String address;

    private Integer city;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private String phone;

    private String email;

    private String image;
}
