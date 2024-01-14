package com.example.GrandPrixTracker.controller;

import com.example.GrandPrixTracker.model.dto.RaceDto;
import com.example.GrandPrixTracker.service.ErgastService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/race")
public class RaceController {

    private final ErgastService ergastService;

    public RaceController(final ErgastService ergastService) {
        this.ergastService = ergastService;
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
