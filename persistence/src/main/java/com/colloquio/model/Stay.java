package com.colloquio.model;

import java.time.LocalDate;

public class Stay {
    private int id;
    private int itineraryId;
    private LocalDate stayDate;
    private String description;
    private int cityId;
    private int weatherId;

    public Stay(int id, int itineraryId, LocalDate stayDate, String description, int cityId, int weatherId) {
        this.id = id;
        this.itineraryId = itineraryId;
        this.stayDate = stayDate;
        this.description = description;
        this.cityId = cityId;
        this.weatherId = weatherId;
    }

    public Stay(int itineraryId, LocalDate stayDate, String description, int cityId, int weatherId) {
        this.itineraryId = itineraryId;
        this.stayDate = stayDate;
        this.description = description;
        this.cityId = cityId;
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItineraryId() {
        return itineraryId;
    }

    public void setItineraryId(int itineraryId) {
        this.itineraryId = itineraryId;
    }

    public LocalDate getStayDate() {
        return stayDate;
    }

    public void setStayDate(LocalDate stayDate) {
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

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }
}
