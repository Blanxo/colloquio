package com.colloquio.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HourlyUnits{
    @JsonProperty("time")
    private String time;
    @JsonProperty("temperature_2m")
    private String temperature2M;
    @JsonProperty("relativehumidity_2m")
    private String relativeHumidity2M;
    @JsonProperty("rain")
    private String rain;
    @JsonProperty("showers")
    private String showers;
    @JsonProperty("snowfall")
    private String snowfall;
    @JsonProperty("cloudcover")
    private String cloudCover;

    public HourlyUnits() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature2M() {
        return temperature2M;
    }

    public void setTemperature2M(String temperature2M) {
        this.temperature2M = temperature2M;
    }

    public String getRelativeHumidity2M() {
        return relativeHumidity2M;
    }

    public void setRelativeHumidity2M(String relativeHumidity2M) {
        this.relativeHumidity2M = relativeHumidity2M;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getShowers() {
        return showers;
    }

    public void setShowers(String showers) {
        this.showers = showers;
    }

    public String getSnowfall() {
        return snowfall;
    }

    public void setSnowfall(String snowfall) {
        this.snowfall = snowfall;
    }

    public String getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(String cloudCover) {
        this.cloudCover = cloudCover;
    }
}