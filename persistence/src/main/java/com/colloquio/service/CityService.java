package com.colloquio.service;


import com.colloquio.model.City;

public interface CityService {

    City create(City city) throws Exception;
    void delete(int id) throws Exception;

    City getById(int id) throws Exception;
    City getByName(String name) throws Exception;

}
