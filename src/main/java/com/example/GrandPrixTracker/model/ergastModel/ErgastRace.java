package com.example.GrandPrixTracker.model.ergastModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ErgastRace implements ErgastListType {
    public String season;
    public String round;
    public String url;
    public String raceName;
    @SerializedName("Circuit")
    public ErgastCircuit circuit;
    public String date;
    public String time;
    @SerializedName("Results")
    public List<ErgastResult> results;
}