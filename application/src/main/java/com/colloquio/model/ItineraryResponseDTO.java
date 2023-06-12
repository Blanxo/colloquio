package com.colloquio.model;

import java.util.List;

public class ItineraryResponseDTO {

    private String message;

    private List<Itinerary> itineraries;

    public ItineraryResponseDTO(String message, List<Itinerary> itineraries) {
        this.message = message;
        this.itineraries = itineraries;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Itinerary> getItineraries() {
        return itineraries;
    }

    public void setItineraries(List<Itinerary> itineraries) {
        this.itineraries = itineraries;
    }
}
