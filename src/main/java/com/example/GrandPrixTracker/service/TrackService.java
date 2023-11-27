package com.example.GrandPrixTracker.service;

import com.example.GrandPrixTracker.model.Track;
import com.example.GrandPrixTracker.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackService {

    @Autowired
    TrackRepository trackRepository;

    public Track saveTrack(Track track) { return trackRepository.save(track); }

    public List<Track> getAllTracks() { return  trackRepository.findAll(); }
}
