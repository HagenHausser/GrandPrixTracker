package com.example.GrandPrixTracker.controller;

import com.example.GrandPrixTracker.model.FavouriteRace;
import com.example.GrandPrixTracker.service.FavouriteRaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favourite")
public class FavouriteRaceController {

    private final FavouriteRaceService service;

    public FavouriteRaceController(final FavouriteRaceService service) {
        this.service = service;
    }

    @GetMapping(value = {"/all", "/", ""})
    public @ResponseBody List<FavouriteRace> getAllFavourites() {
        return service.getAllFavourites();
    }

    @PostMapping("/add")
    public @ResponseBody FavouriteRace addFavourite(@RequestBody FavouriteRace favourite) {
        return service.saveFavourite(favourite);
    }

    @PostMapping("/remove")
    public void removeFavourite(@RequestBody FavouriteRace favourite) {
        service.deleteFavourite(favourite);
    }
}
