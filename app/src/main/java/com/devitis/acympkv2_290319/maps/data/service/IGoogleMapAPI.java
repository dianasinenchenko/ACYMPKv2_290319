package com.devitis.acympkv2_290319.maps.data.service;

import com.devitis.acympkv2_290319.maps.data.model.Direction;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Diana on 02.04.2019.
 */

public interface IGoogleMapAPI {

    @GET("api/directions/json?key=AIzaSyD9EagKsWiKToCHCpLGsoEUJ1zEPDEp3Fs")
    Call<Direction> getDirection(@Query("origin") String origin, @Query("destination") String destination);
}

