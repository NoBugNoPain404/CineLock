package com.example.cine_management.repository;

import com.example.cine_management.entity.MovieGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieGenreRepository extends JpaRepository<MovieGenre, Integer> {

    @Query("""
        select mv.genre.name
        from MovieGenre mv
        where mv.movie.id = :movieId
    """
    )
    List<String> getMovieGenreByMovieId(Integer movieId);
}
