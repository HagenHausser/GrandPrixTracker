package com.example.GrandPrixTracker.model.ergastModel;

import com.google.gson.annotations.SerializedName;

public class ErgastFastestLap {
    public String rank;
    public String lap;
    @SerializedName("Time")
    public ErgastTime time;
}
