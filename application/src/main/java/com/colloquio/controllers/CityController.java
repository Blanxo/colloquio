package com.colloquio.controllers;

import com.colloquio.model.City;
import com.colloquio.model.CityResponseDTO;
import com.colloquio.service.CityService;
import com.colloquio.service.GeocodingService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
        consumes = MediaType.ALL_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        value = "/api/city"
)
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private GeocodingService geocodingService;

    @PostMapping(value = "/create")
    public CityResponseDTO createCity(@RequestBody City city) throws JsonProcessingException {
        City cityEntity = geocodingService.getCityData(city.getName());
        try {
            cityService.create(cityEntity);
            return new CityResponseDTO("Città creata correttamente", cityEntity);
        } catch (Exception e) {
            return new CityResponseDTO(e.getMessage(), cityEntity);
        }
    }

    @DeleteMapping(value = "/delete")
    public CityResponseDTO deleteCity(@RequestParam int id) {
        try {
            cityService.delete(id);
            return new CityResponseDTO("Città eliminata correttamente", null);
        } catch (Exception e) {
            return new CityResponseDTO(e.getMessage(), null);
        }
    }

    @GetMapping(value = "/getByName")
    public CityResponseDTO getCityByName(@RequestParam String name) {
        try {
            City city = cityService.getByName(name);
            return new CityResponseDTO("Città ottenuta correttamente", city);
        } catch (Exception e) {
            return new CityResponseDTO(e.getMessage(), null);
        }
    }

    @GetMapping(value = "/getById")
    public CityResponseDTO getCityById(@RequestParam int id) {
        try {
            City city = cityService.getById(id);
            return new CityResponseDTO("Città ottenuta correttamente", city);
        } catch (Exception e) {
            return new CityResponseDTO(e.getMessage(), null);
        }
    }
}
