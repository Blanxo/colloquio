package com.colloquio.model;

import java.time.LocalDate;

public class StayInput {
    private int cityId;
    private int itineraryId;

    private String description;
    private LocalDate stayDate;

    public StayInput(int cityId, int itineraryId, String description, LocalDate stayDate) {
        this.cityId = cityId;
        this.itineraryId = itineraryId;
        this.description = description;
        this.stayDate = stayDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public LocalDate getStayDate() {
        return stayDate;
    }

    public void setStayDate(LocalDate stayDate) {
        this.stayDate = stayDate;
    }

    public int getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }
}
