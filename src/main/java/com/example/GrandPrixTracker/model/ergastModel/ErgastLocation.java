package com.example.GrandPrixTracker.model.ergastModel;

import com.google.gson.annotations.SerializedName;

public class ErgastLocation {
    @SerializedName("lat")
    public String latitude;
    @SerializedName("long")
    public String longitude;
    public String locality;
    public String country;
}
