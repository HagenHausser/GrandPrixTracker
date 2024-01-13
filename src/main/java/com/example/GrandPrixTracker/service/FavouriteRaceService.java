package com.example.GrandPrixTracker.service;

import com.example.GrandPrixTracker.model.FavouriteRace;
import com.example.GrandPrixTracker.model.dto.RaceDto;
import com.example.GrandPrixTracker.model.ergastModel.ErgastRace;
import com.example.GrandPrixTracker.repository.FavouriteRaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteRaceService {
    private final FavouriteRaceRepository repository;

    public FavouriteRaceService(final FavouriteRaceRepository repository) {
        this.repository = repository;
    }

    public List<FavouriteRace> getAllFavourites() {
        return repository.findAll();
    }

    public FavouriteRace saveFavourite(FavouriteRace favouriteRace) {
        return repository.save(favouriteRace);
    }

    public void deleteFavourite(FavouriteRace favouriteRace) {
        repository.delete(favouriteRace);
    }

    public Boolean isFavourite(ErgastRace race) {
        FavouriteRace favouriteRace = repository.findBySeasonAndRound(Integer.parseInt(race.season),
                Integer.parseInt(race.round));
        return favouriteRace != null;
    }
}
