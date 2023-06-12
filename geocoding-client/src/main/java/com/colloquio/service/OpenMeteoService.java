package com.colloquio.service;

import com.colloquio.model.WeatherConditions;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.time.LocalDate;

public interface OpenMeteoService {
    public WeatherConditions getCityWeather(double latitude, double longitude, LocalDate stayDate) throws JsonProcessingException;
}
