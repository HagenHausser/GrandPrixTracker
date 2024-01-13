package com.example.GrandPrixTracker.model.ergastModel;

import com.google.gson.annotations.SerializedName;

public class ErgastResponse<ErgastListType> {
    @SerializedName("MRData")
    public ErgastResponseData<ErgastListType> data;
}
