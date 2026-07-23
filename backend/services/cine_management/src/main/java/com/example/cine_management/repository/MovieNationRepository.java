package com.example.cine_management.repository;

import com.example.cine_management.entity.MovieGenre;
import com.example.cine_management.entity.MovieNation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieNationRepository extends JpaRepository<MovieNation, Integer> {

    @Query("""
        select mn.nation.name
        from MovieNation mn
        where mn.movie.id = :movieId
    """
    )
    List<String> getMovieNationByMovieId(Integer movieId);
}
