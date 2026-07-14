package com.example.cine_management.pojo;

import com.example.cine_management.entity.PersonNationality;
import com.example.cine_management.enums.Gender;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public record PersonDetailDto (

    Integer id,

    String name,

    Gender gender,

    Date dob,

    Set<String> nationality,

    String image,

    String note

) implements Serializable {}
