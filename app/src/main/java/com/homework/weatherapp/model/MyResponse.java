package com.homework.weatherapp.model;

import com.google.gson.annotations.SerializedName;

public class MyResponse {
    @SerializedName("main")
    Weather weather;

    @SerializedName("name")
    String name;


    public Weather getWeather() {
        return weather;
    }

    public String getName() {
        return name;
    }
}
