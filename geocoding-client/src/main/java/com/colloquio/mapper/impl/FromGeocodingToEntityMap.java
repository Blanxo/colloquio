package com.colloquio.mapper.impl;

import com.colloquio.mapper.GeocodingMapper;
import com.colloquio.model.City;
import com.colloquio.model.CityDataGeocode;
import com.colloquio.model.Result;
import org.springframework.stereotype.Service;

@Service
public class FromGeocodingToEntityMap implements GeocodingMapper {

    public City convertFromCityDataGeocode(CityDataGeocode cityDataGeocode) {
        Result firstAndOnlyResult = cityDataGeocode.getResults()[0];
        String name = firstAndOnlyResult.getName();
        double latitude = firstAndOnlyResult.getLatitude();
        double longitude = firstAndOnlyResult.getLongitude();
        return new City(name, latitude, longitude);
    }
}
