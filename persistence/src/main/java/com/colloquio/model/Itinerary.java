package com.colloquio.model;

import java.time.LocalDate;

public class Itinerary {
    private int id;
    private int userId;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private int itineraryStatusId;

    public Itinerary(int id, int userId, String description, LocalDate startDate, LocalDate endDate, int itineraryStatusId) {
        this.id = id;
        this.userId = userId;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.itineraryStatusId = itineraryStatusId;
    }

    public Itinerary() {
    }

    public int getItineraryStatusId() {
        return itineraryStatusId;
    }

    public void setItineraryStatusId(int itineraryStatusId) {
        this.itineraryStatusId = itineraryStatusId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
