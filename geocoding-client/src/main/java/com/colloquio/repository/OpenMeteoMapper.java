package com.colloquio.repository;

import com.colloquio.model.WeatherConditions;
import com.colloquio.model.WeatherDataOpenMeteo;

public interface OpenMeteoMapper {

    WeatherConditions convertFromWeatherDataOpenMeteo(WeatherDataOpenMeteo weatherData);
}
