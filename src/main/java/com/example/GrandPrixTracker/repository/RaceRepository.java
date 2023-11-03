package com.example.GrandPrixTracker.repository;

import com.example.GrandPrixTracker.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {
    List<Race> findByName(String name);

    List<Race> findByCountry(String name);

    Race findById(long id);
}
