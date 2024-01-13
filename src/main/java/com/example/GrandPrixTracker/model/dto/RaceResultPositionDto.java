package com.example.GrandPrixTracker.model.dto;

public class RaceResultPositionDto {
    public Integer position;
    public String driver;
    public String constructor;
    public Integer laps;
    public Double points;
    public Boolean fastestLap;

    public RaceResultPositionDto(Integer position, String driver, String constructor, Integer laps,
                                 Double points, Boolean fastestLap) {
        this.position = position;
        this.driver = driver;
        this.constructor = constructor;
        this.laps = laps;
        this.points = points;
        this.fastestLap = fastestLap;
    }
}
