package com.homework.weatherapp.api;

import com.homework.weatherapp.model.MyResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/data/2.5/weather")
    Call<MyResponse> getWeather(@Query("q") String location, @Query("appid") String appId );


}
