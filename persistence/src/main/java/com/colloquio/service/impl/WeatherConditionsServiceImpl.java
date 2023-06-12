package com.colloquio.service.impl;

import com.colloquio.repository.WeatherRepository;
import com.colloquio.model.WeatherConditions;
import com.colloquio.service.WeatherConditionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherConditionsServiceImpl implements WeatherConditionsService {

    @Autowired
    private WeatherRepository repository;

    @Override
    public WeatherConditions create(WeatherConditions weatherConditions) {
        repository.insert(weatherConditions);
        return weatherConditions;
    }

    @Override
    public WeatherConditions getWeatherConditionsById(int id) {
        return repository.findWeatherById(id);
    }


}
