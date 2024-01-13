package com.example.GrandPrixTracker.repository;

import com.example.GrandPrixTracker.model.FavouriteRace;
import com.example.GrandPrixTracker.model.FavouriteRaceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteRaceRepository extends JpaRepository<FavouriteRace, FavouriteRaceId> {
    public FavouriteRace findBySeasonAndRound(Integer season, Integer round);
}