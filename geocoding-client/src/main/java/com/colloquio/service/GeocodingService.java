package com.colloquio.service;

import com.colloquio.model.City;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface GeocodingService {

    public City getCityData(String name) throws JsonProcessingException;
}
