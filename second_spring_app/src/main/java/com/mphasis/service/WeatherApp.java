package com.mphasis.service;

public class WeatherApp {
    public String getWeather(String city) {
        if (city.equals("pune")) {
            return "Hot.....Sunny weather";
        }
        if (city.equals("Delhi")) {
            return "windy,hot..";
        } else {
            return "Unknown";
        }

    }
}
