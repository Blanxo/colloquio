package com.colloquio.model;

public enum ItineraryCondition {
    // In base all'id il front end può scegliere l'icona da mostrare
    CLEAR_SKY(1, "CREATED"),
    CLOUDY(2, "READY"),
    RAIN_SHOWERS(3, "CONFIRMED"),
    SNOW_SHOWERS(4, "ENDED");

    private int id;
    private String description;

    ItineraryCondition(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
