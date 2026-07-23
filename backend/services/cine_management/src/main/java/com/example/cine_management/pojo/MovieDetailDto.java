package com.example.cine_management.pojo;

import com.example.cine_management.enums.AgeRatings;
import com.example.cine_management.enums.MovieStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.Instant;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetailDto {

    private Integer id;

    private String name;

    private String description;

    private Date releaseDate;

    private AgeRatings ageRatings;

    private String banner;

    private String trailer;

    private Float rates;

    private Integer votes;

    private Integer voteSum;

    private MovieStatus status;

    private Instant createdAt;

    private Instant updatedAt;

    // Additional fields
    private List<String> genres;

    private List<String> nations;

    private List<String> companies;

    private List<BasicPersonDto> actors;

    private List<BasicPersonDto> directors;
}
