package com.example.GrandPrixTracker.model.ergastModel;

import com.google.gson.annotations.SerializedName;

public class ErgastResponseData<ErgastListType> {
    public String xmlns;
    public String series;
    public String url;
    public String limit;
    public String offset;
    public String total;
    @SerializedName("RaceTable")
    public ErgastRaceTable<ErgastListType> raceTable;
}
