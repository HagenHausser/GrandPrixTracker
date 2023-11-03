package com.example.GrandPrixTracker.service;

import com.example.GrandPrixTracker.model.Race;
import com.example.GrandPrixTracker.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceService {

    @Autowired
    RaceRepository raceRepository;

    public Race saveRace(Race race) {
        return raceRepository.save(race);
    }

    public List<Race> getAllRaces() {
        return raceRepository.findAll();
    }

    public Race getRace(long id) {
        return raceRepository.findById(id);
    }
}
