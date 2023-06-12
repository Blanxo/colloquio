package com.colloquio.repository;

import com.colloquio.model.City;
import com.colloquio.model.CityDataGeocode;

public interface GeocodingMapper {

    City convertFromCityDataGeocode(CityDataGeocode cityDataGeocode);
}
