package com.example.cine_management.repository.impl;

import com.example.cine_management.entity.Cinema;
import com.example.cine_management.enums.CinemaStatus;
import com.example.cine_management.repository.custom.CinemaRepositoryCustom;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class CinemaRepositoryImpl implements CinemaRepositoryCustom {

    @PersistenceContext
    private final EntityManager em;

    public List<Cinema> findAllActiveCinema() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Cinema> query = cb.createQuery(Cinema.class);
        Root<Cinema> root = query.from(Cinema.class);

        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.equal(root.get("status"), CinemaStatus.ACTIVE));
        query.select(root)
                .where(predicates.toArray(Predicate[]::new));

        return em.createQuery(query).getResultList();
    }
}
