package com.example.cine_management.repository;

import com.example.cine_management.entity.MovieCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieCompanyRepository extends JpaRepository<MovieCompany, Integer> {

    @Query("""
        select mc.productCompany.name
        from MovieCompany mc
        where mc.movie.id = :movieId
    """
    )
    List<String> getMovieCompaniesByMovieId(Integer movieId);
}
