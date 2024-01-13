package com.example.GrandPrixTracker.model.dto;

import com.example.GrandPrixTracker.model.ergastModel.ErgastRace;

import java.time.LocalDate;

public class GrandPrixDto {
    public Integer round;
    public String raceName;
    public LocalDate date;
    public String circuit;
    public String raceReportUrl;


    public GrandPrixDto(Integer round, String raceName, LocalDate date, String circuit, String raceReportUrl) {
        this.round = round;
        this.raceName = raceName;
        this.date = date;
        this.circuit = circuit;
        this.raceReportUrl = raceReportUrl;
    }

    public static GrandPrixDto from(ErgastRace raceData) {
        return new GrandPrixDto(Integer.parseInt(raceData.round), raceData.raceName,
                LocalDate.parse(raceData.date), raceData.circuit.circuitName, raceData.url);
    }
}
