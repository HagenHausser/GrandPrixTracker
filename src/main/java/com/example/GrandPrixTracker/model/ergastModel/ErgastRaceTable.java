package com.example.GrandPrixTracker.model.ergastModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErgastRaceTable<ErgastListType> {
    public String season;
    public String round;
    @SerializedName("Races")
    public List<ErgastListType> races;
}
