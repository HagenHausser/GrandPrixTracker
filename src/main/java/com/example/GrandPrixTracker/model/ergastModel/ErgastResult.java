package com.example.GrandPrixTracker.model.ergastModel;

import com.google.gson.annotations.SerializedName;

public class ErgastResult {
    public String number;
    public String position;
    public String positionText;
    public String points;
    @SerializedName("Driver")
    public ErgastDriver driver;
    @SerializedName("Constructor")
    public ErgastConstructor constructor;
    public String grid;
    public String laps;
    public String status;
    @SerializedName("Time")
    public ErgastTime time;
    @SerializedName("FastestLap")
    public ErgastFastestLap fastestLap;
}
