package com.example.GrandPrixTracker.model.ergastModel;

import com.google.gson.annotations.SerializedName;

public class ErgastCircuit {
    public String circuitId;
    public String url;
    public String circuitName;
    @SerializedName("Location")
    public ErgastLocation location;
}
