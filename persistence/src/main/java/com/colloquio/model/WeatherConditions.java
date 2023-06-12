package com.colloquio.model;

public class WeatherConditions {
    private int id;
    private double temperature;
    private double humidity;
    private int skyConditionId;

    public WeatherConditions(int id, double temperature, double humidity, int skyConditionId) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.skyConditionId = skyConditionId;
    }

    public WeatherConditions() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public int getSkyConditionId() {
        return skyConditionId;
    }

    public void setSkyConditionId(int skyConditionId) {
        this.skyConditionId = skyConditionId;
    }
}
