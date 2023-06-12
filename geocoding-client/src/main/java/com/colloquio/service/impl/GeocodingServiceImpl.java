package com.colloquio.service.impl;

import com.colloquio.repository.GeocodingMapper;
import com.colloquio.model.City;
import com.colloquio.model.CityDataGeocode;
import com.colloquio.service.GeocodingService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeocodingServiceImpl implements GeocodingService {

    @Autowired
    GeocodingMapper geocodingMapper;


    @Override
    public City getCityData(String name) throws JsonProcessingException {

        String apiUrl = "https://geocoding-api.open-meteo.com/v1/search?name={name}&count=1&language=it";

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class, name);

        if (response.getStatusCode().is2xxSuccessful()) {
            String responseBody = response.getBody();
            ObjectMapper objectMapper = new ObjectMapper();
            CityDataGeocode cityDataGeocode =  objectMapper.readValue(responseBody, CityDataGeocode.class);
            return geocodingMapper.convertFromCityDataGeocode(cityDataGeocode);
        } else {
            return null; // TODO gestione errori
        }
    }
}
