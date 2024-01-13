package com.example.GrandPrixTracker.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

public class FavouriteRaceId implements Serializable {
    private Integer season;

    private Integer round;

    public FavouriteRaceId(Integer season, Integer round) {
        this.season = season;
        this.round = round;
    }

    public FavouriteRaceId() {

    }
}