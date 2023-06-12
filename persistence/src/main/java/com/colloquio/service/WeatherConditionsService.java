package com.colloquio.service;

import com.colloquio.model.WeatherConditions;

public interface WeatherConditionsService {

    WeatherConditions create(WeatherConditions weatherConditions);

    WeatherConditions getWeatherConditionsById(int id);

}
