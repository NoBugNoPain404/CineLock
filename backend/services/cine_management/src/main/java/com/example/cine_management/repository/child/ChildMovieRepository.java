package com.example.cine_management.repository.child;

import com.example.cine_management.repository.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
@Getter
public class ChildMovieRepository {

    private final MovieActorRepository movieActorRepository;

    private final MovieDirectorRepository movieDirectorRepository;

    private final MovieGenreRepository movieGenreRepository;

    private final MovieNationRepository movieNationRepository;

    private final MovieCompanyRepository movieCompanyRepository;
}
