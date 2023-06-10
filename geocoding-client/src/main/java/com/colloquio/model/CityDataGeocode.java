package com.colloquio.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CityDataGeocode {

    private Result[] results;
    @JsonProperty("generationtime_ms")
    private double generationtimeMS;

    public Result[] getResults() {
        return results;
    }

    public void setResults(Result[] value) {
        this.results = value;
    }

    public double getGenerationtimeMS() {
        return generationtimeMS;
    }

    public void setGenerationtimeMS(double value) {
        this.generationtimeMS = value;
    }


}
