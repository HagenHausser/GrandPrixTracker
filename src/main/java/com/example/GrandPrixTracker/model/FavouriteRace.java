package com.example.GrandPrixTracker.model;

import jakarta.persistence.*;

@Entity
@IdClass(FavouriteRaceId.class)
public class FavouriteRace {

    @Id
    @Column(nullable = false)
    private Integer season;

    @Id
    @Column(nullable = false)
    private Integer round;

    @Column(nullable = false)
    private String raceName;

    @Column
    private String comment;

    @Column
    private String raceReportUrl;

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRaceReportUrl() {
        return raceReportUrl;
    }

    public void setRaceReportUrl(String raceReportUrl) {
        this.raceReportUrl = raceReportUrl;
    }
}
