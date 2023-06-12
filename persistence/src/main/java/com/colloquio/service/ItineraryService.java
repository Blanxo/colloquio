package com.colloquio.service;

import com.colloquio.model.Itinerary;

import java.util.List;

public interface ItineraryService {

    Itinerary create(Itinerary itinerary);

    List<Itinerary> getItinerariesByUsername(String username);

    List<Itinerary> getItinerariesByUserId(int userId);

    void update(Itinerary itinerary);

}
