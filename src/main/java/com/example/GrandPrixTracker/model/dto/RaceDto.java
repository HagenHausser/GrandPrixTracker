package com.example.GrandPrixTracker.model.dto;

import com.example.GrandPrixTracker.model.ergastModel.ErgastRace;
import com.example.GrandPrixTracker.model.ergastModel.ErgastResult;

import java.util.ArrayList;
import java.util.List;

public class RaceDto {
    public Boolean isFavourite;
    public String locality;
    public String country;
    public List<RaceResultPositionDto> positions;

    public static RaceDto from(ErgastRace raceData) {
        RaceDto race = new RaceDto();
        List<RaceResultPositionDto> positions = new ArrayList<>();

        race.country = raceData.circuit.location.country;
        race.locality = raceData.circuit.location.locality;

        for (ErgastResult result : raceData.results) {
            positions.add(new RaceResultPositionDto(Integer.parseInt(result.position)
                    ,result.driver.givenName + " " + result.driver.familyName, result.constructor.name
                    , Integer.parseInt(result.laps), Double.parseDouble(result.points), hasFastestLap(result)));
        }
        race.positions = positions;

        return race;
    }

    private static Boolean hasFastestLap(ErgastResult result) {
        if (result.fastestLap == null) return false;
        return Integer.parseInt(result.fastestLap.rank) == 1;
    }

}
