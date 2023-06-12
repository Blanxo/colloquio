package com.colloquio.controllers;

import com.colloquio.model.*;
import com.colloquio.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
        consumes = MediaType.ALL_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        value = "/api/stay"
)
public class StayController {

    @Autowired
    private OpenMeteoService openMeteoService;

    @Autowired
    private WeatherConditionsService weatherConditionsService;

    @Autowired
    private CityService cityService;

    @Autowired
    private StayService stayService;

    @Autowired
    private ItineraryService itineraryService;

    /*
    Ad ogni inserimento di una tappa recupero il meteo della città in questione, creo il meteo e la tappa e setto l'itinerario su ready
     */
    @PostMapping(value = "/create")
    @Transactional
    public StayResponseDTO getWeather(@RequestBody StayInput stayInput) {
        try {
            City city = cityService.getById(stayInput.getCityId());
            WeatherConditions weatherConditions = openMeteoService.getCityWeather(city.getLatitude(), city.getLongitude(), stayInput.getStayDate());
            weatherConditions = weatherConditionsService.create(weatherConditions);
            Stay stay = new Stay(stayInput.getItineraryId(), stayInput.getStayDate(), stayInput.getDescription(), stayInput.getCityId(), weatherConditions.getId());
            stayService.create(stay);
            Itinerary itineraryToUpdate = new Itinerary();
            itineraryToUpdate.setId(stay.getItineraryId());
            itineraryToUpdate.setItineraryStatusId(2);
            itineraryService.update(itineraryToUpdate);
            return new StayResponseDTO("Tappa inserita correttamente", List.of(stay));
        } catch (Exception e) {
            return new StayResponseDTO("Tappa non inserita a causa di " + e.getMessage(), null);
        }
    }


    @GetMapping(value = "/getByItineraryId")
    public StayResponseDTO getStayByItineraryId(@RequestParam int id) {
        try {
            List<Stay> stays = stayService.getStayByItineraryId(id);
            return new StayResponseDTO("Tappe ottenute correttamente", stays);
        } catch (Exception e) {
            return new StayResponseDTO("Tappa non ottenuta a causa di " + e.getMessage(), null);
        }
    }
}
