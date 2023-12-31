package com.example.GrandPrixTracker.repository;

import com.example.GrandPrixTracker.model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackRepository extends JpaRepository<Track, Long> {

}
