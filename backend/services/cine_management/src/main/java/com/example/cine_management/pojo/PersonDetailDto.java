package com.example.cine_management.pojo;

import com.example.cine_management.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonDetailDto {

    private Integer id;

    private String name;

    private Gender gender;

    private Date dob;

    private Set<String> nationality;

    private String image;

    private String note;

}