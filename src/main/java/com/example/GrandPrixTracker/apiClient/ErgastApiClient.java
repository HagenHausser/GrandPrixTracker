package com.example.GrandPrixTracker.apiClient;

import com.example.GrandPrixTracker.model.ergastModel.ErgastRace;
import com.example.GrandPrixTracker.model.ergastModel.ErgastResponse;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

import java.util.concurrent.CompletableFuture;

public interface ErgastApiClient {

    String BASE_URL = "https://ergast.com/api/f1/";

    @GET( "{year}/{round}/results.json")
    @Headers("accept: application/json")
    CompletableFuture<ErgastResponse<ErgastRace>> getRaceResult(@Path("year") Integer year, @Path("round") Integer round);

    @GET("{year}.json")
    @Headers("accept: application/json")
    CompletableFuture<ErgastResponse<ErgastRace>> getSeasonGrandPrixs(@Path("year") Integer year);

    static ErgastApiClient create(){
        Retrofit retrofit =  new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ErgastApiClient.class);
    }
}
