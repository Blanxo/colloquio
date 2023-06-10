package com.colloquio.model;

public class CityResponseDTO {
    private String message;
    private City city;

    public CityResponseDTO(String message, City city) {
        this.message = message;
        this.city = city;
    }

    public CityResponseDTO() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
