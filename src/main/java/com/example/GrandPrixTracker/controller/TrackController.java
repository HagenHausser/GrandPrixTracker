package com.example.GrandPrixTracker.controller;

import com.example.GrandPrixTracker.model.Track;
import com.example.GrandPrixTracker.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/track")
public class TrackController {

    @Autowired
    TrackService trackService;

    @PostMapping("/save")
    public @ResponseBody Track saveTrack(@RequestBody Track track) {
        return trackService.saveTrack(track);
    }

    @GetMapping(value = {"", "/", "/all"})
    public @ResponseBody List<Track> getAllTracks() {
        return trackService.getAllTracks();
    }
}
