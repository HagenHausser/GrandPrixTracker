package com.example.GrandPrixTracker.controller;

import com.example.GrandPrixTracker.model.dto.GrandPrixDto;
import com.example.GrandPrixTracker.service.ErgastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/season")
public class SeasonController {

    @Autowired
    ErgastService ergastService;

    @GetMapping("/{year}")
    public @ResponseBody List<GrandPrixDto> getSeasonGrandPrixs(@PathVariable Integer year) {
        return ergastService.getSeasonGrandPrixs(year);
    }
}
