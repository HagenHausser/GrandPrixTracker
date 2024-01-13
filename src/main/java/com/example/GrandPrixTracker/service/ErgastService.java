package com.example.GrandPrixTracker.service;

import com.example.GrandPrixTracker.apiClient.ErgastApiClient;
import com.example.GrandPrixTracker.model.dto.GrandPrixDto;
import com.example.GrandPrixTracker.model.dto.RaceDto;
import com.example.GrandPrixTracker.model.ergastModel.ErgastRace;
import com.example.GrandPrixTracker.model.ergastModel.ErgastResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ErgastService {

    private final ErgastApiClient ergastClient = ErgastApiClient.create();

    private final FavouriteRaceService favouriteRaceService;

    public ErgastService(final FavouriteRaceService favouriteRaceService) {
        this. favouriteRaceService = favouriteRaceService;
    }

    public RaceDto getRaceResults(Integer year, Integer round) {
        RaceDto race = new RaceDto();
        try {
            ErgastResponse<ErgastRace> response = ergastClient.getRaceResult(year, round).get();
            if (!response.data.raceTable.races.isEmpty()) {
                ErgastRace ergastRace = response.data.raceTable.races.get(0);
                race = RaceDto.from(ergastRace);
                if (favouriteRaceService.isFavourite(ergastRace)) {
                    race.isFavourite = true;
                }
            }
        } catch (Exception exc) {
            System.out.println("Error fetching race result: " + exc);
        }
        return race;
    }

    public List<GrandPrixDto> getSeasonGrandPrixs(Integer year) {
        List<GrandPrixDto> grandPrixs = new ArrayList<>();
        try {
            ErgastResponse<ErgastRace> response = ergastClient.getSeasonGrandPrixs(year).get();

            for (ErgastRace race : response.data.raceTable.races) {
                grandPrixs.add(GrandPrixDto.from(race));
            }
        } catch (Exception exc) {
            System.out.println("Error fetching race result: " + exc);
        }
        return grandPrixs;
    }
}
