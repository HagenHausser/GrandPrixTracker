package com.example.GrandPrixTracker.controller;

import com.example.GrandPrixTracker.model.Race;
import com.example.GrandPrixTracker.model.dto.RaceDto;
import com.example.GrandPrixTracker.repository.RaceRepository;
import com.example.GrandPrixTracker.service.ErgastService;
import com.example.GrandPrixTracker.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/race")
public class RaceController {

    @Autowired
    RaceService raceService;

    @Autowired
    ErgastService ergastService;


    @PostMapping("/save")
    public @ResponseBody Race saveRace(@RequestBody Race race) {
        return raceService.saveRace(race);
    }

    @GetMapping(value = {"/all", "/", ""})
    public @ResponseBody List<Race> getAllRaces() {
        return raceService.getAllRaces();
    }

    @GetMapping(value = {"/{id}"})
    public @ResponseBody Race getRace(@PathVariable long id) {
        return raceService.getRace(id);
    }

    @GetMapping("/{year}/{round}")
    public @ResponseBody RaceDto getRaceResult(@PathVariable Integer year, @PathVariable Integer round) {
        return ergastService.getRaceResults(year, round);
    }

    @GetMapping("/{year}/all")
    public @ResponseBody List<RaceDto> getYearsRaceResult(@PathVariable Integer year) {
        return ergastService.getYearsRaceResults(year);
    }
}
