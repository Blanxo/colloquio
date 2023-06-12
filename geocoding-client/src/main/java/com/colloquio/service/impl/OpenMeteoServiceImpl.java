package com.colloquio.service.impl;

import com.colloquio.repository.OpenMeteoMapper;
import com.colloquio.model.WeatherConditions;
import com.colloquio.model.WeatherDataOpenMeteo;
import com.colloquio.service.OpenMeteoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Service
public class OpenMeteoServiceImpl implements OpenMeteoService {

    @Autowired
    private OpenMeteoMapper mapper;

    @Override
    public WeatherConditions getCityWeather(double latitude, double longitude, LocalDate stayDate) throws JsonProcessingException {

        String apiUrl = "https://api.open-meteo.com/v1/forecast?latitude={latitude}&" +
                "longitude={longitude}&hourly=temperature_2m,relativehumidity_2m,rain,showers,snowfall,cloudcover&forecast_days=1&" +
                "start_date={startDate}&" +
                "end_date={endDate}&timezone=Europe/Berlin";

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class, latitude, longitude, stayDate, stayDate);

        if (response.getStatusCode().is2xxSuccessful()) {
            String responseBody = response.getBody();
            ObjectMapper objectMapper = new ObjectMapper();
            WeatherDataOpenMeteo weatherData =  objectMapper.readValue(responseBody, WeatherDataOpenMeteo.class);
            return mapper.convertFromWeatherDataOpenMeteo(weatherData);
        } else {
            return null; // TODO gestione errori
        }
    }
}
