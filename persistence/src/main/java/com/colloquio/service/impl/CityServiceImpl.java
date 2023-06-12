package com.colloquio.service.impl;

import com.colloquio.repository.CityRepository;
import com.colloquio.model.City;
import com.colloquio.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository repository;

    @Override
    public City create(City city) throws Exception {
        Optional<City> findCity = Optional.ofNullable(repository.findCity(city.getName(), city.getLatitude(), city.getLongitude()));
        if (findCity.isPresent()) {
            throw new Exception("La città esiste già");
        }
        repository.insert(city);
        return city;
    }

    @Override
    public void delete(int id) throws Exception {
        boolean isDeleted = repository.deleteById(id);
        if(!isDeleted) {
            throw new Exception("Non è stato possibile cancellare la città, assicurarsi che l'id sia corretto");
        }
    }

    @Override
    public City getById(int id) throws Exception {
        Optional<City> city = Optional.ofNullable(repository.findCityById(id));
        if(city.isEmpty()){
            throw new Exception("La città non esiste, assicurarsi che l'ID sia corretto");
        }
        return city.get();
    }

    @Override
    public City getByName(String name) throws Exception {
        Optional<City> city = Optional.ofNullable(repository.findCityByName(name));
        if(city.isEmpty()){
            throw new Exception("La città non esiste, assicurarsi che il nome sia corretto");
        }
        return city.get();
    }
}
