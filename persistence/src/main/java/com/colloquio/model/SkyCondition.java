package com.colloquio.model;

public enum SkyCondition {
    // In base all'id il front end può scegliere l'icona da mostrare
    CLEAR_SKY(1, "CLEAR_SKY"),
    CLOUDY(2, "CLOUDY"),
    RAIN_SHOWERS(3, "RAIN_SHOWERS"),
    SNOW_SHOWERS(4, "SNOW_SHOWERS");

    private int id;
    private String description;

    SkyCondition(int id, String description) {
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
