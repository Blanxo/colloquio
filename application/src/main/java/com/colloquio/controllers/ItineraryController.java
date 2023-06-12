package com.colloquio.controllers;

import com.colloquio.model.Itinerary;
import com.colloquio.model.ItineraryResponseDTO;
import com.colloquio.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
        consumes = MediaType.ALL_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE,
        value = "/api/itinerary"
)
public class ItineraryController {

    @Autowired
    private ItineraryService itineraryService;

    @PostMapping(value = "/create")
    public ItineraryResponseDTO createItinerary(@RequestBody Itinerary itinerary) {
        itinerary.setItineraryStatusId(1);
        itineraryService.create(itinerary);
        return new ItineraryResponseDTO("Itinerary creato correttamente", List.of(itinerary));
    }

    // TODO Delete itinerary

    @GetMapping(value = "/getByUsername")
    public ItineraryResponseDTO getItinerariesByUsername(@RequestParam String username) {
        List<Itinerary> itineraries = itineraryService.getItinerariesByUsername(username);
        return new ItineraryResponseDTO("Sono stati trovati " + itineraries.size() + " itinerari", itineraries);
    }

    @GetMapping(value = "/getByUserId")
    public ItineraryResponseDTO getItinerariesByUserId(@RequestParam int userId) {
        List<Itinerary> itineraries = itineraryService.getItinerariesByUserId(userId);
        return new ItineraryResponseDTO("Sono stati trovati " + itineraries.size() + " itinerari", itineraries);
    }

    @PutMapping(value = "/changeStatus")
    public ItineraryResponseDTO getItinerariesByUserId(@RequestBody Itinerary itinerary) {
        try {
            itineraryService.update(itinerary);
            return new ItineraryResponseDTO("Status cambiato correttamente", null);
        } catch (Exception e) {
            return new ItineraryResponseDTO("Errore nel cambiare stato, assicurarsi che lo stato e l'id siano corretti", null);
        }
    }

}
