package com.colloquio.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hourly {
    @JsonProperty("time")
    private String[] time;

    @JsonProperty("temperature_2m")
    private Double[] temperature2M;

    @JsonProperty("relativehumidity_2m")
    private Integer[] relativeHumidity2M;

    @JsonProperty("rain")
    private Double[] rain;

    @JsonProperty("showers")
    private Double[] showers;


    @JsonProperty("snowfall")
    private Double[] snowfall;

    @JsonProperty("cloudcover")
    private Integer[] cloudCover;

    public Hourly() {
    }

    public String[] getTime() {
        return time;
    }

    public void setTime(String[] time) {
        this.time = time;
    }

    public Double[] getTemperature2M() {
        return temperature2M;
    }

    public void setTemperature2M(Double[] temperature2M) {
        this.temperature2M = temperature2M;
    }

    public Integer[] getRelativeHumidity2M() {
        return relativeHumidity2M;
    }

    public void setRelativeHumidity2M(Integer[] relativeHumidity2M) {
        this.relativeHumidity2M = relativeHumidity2M;
    }

    public Double[] getRain() {
        return rain;
    }

    public void setRain(Double[] rain) {
        this.rain = rain;
    }

    public Double[] getShowers() {
        return showers;
    }

    public void setShowers(Double[] showers) {
        this.showers = showers;
    }

    public Double[] getSnowfall() {
        return snowfall;
    }

    public void setSnowfall(Double[] snowfall) {
        this.snowfall = snowfall;
    }

    public Integer[] getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(Integer[] cloudCover) {
        this.cloudCover = cloudCover;
    }
}