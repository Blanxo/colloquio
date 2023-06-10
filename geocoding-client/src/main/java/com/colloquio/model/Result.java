package com.colloquio.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
    private long id;
    private String name;
    private double latitude;
    private double longitude;
    private double elevation;
    @JsonProperty("feature_code")
    private String featureCode;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("admin1_id")
    private long admin1ID;
    @JsonProperty("admin2_id")
    private long admin2ID;
    @JsonProperty("admin3_id")
    private long admin3ID;
    private String timezone;
    private long population;
    private String[] postcodes;
    @JsonProperty("country_id")
    private long countryID;
    private String country;
    private String admin1;
    private String admin2;
    private String admin3;

    public long getID() {
        return id;
    }

    public void setID(long value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double value) {
        this.latitude = value;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double value) {
        this.longitude = value;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double value) {
        this.elevation = value;
    }

    public String getFeatureCode() {
        return featureCode;
    }

    public void setFeatureCode(String value) {
        this.featureCode = value;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    public long getAdmin1ID() {
        return admin1ID;
    }

    public void setAdmin1ID(long value) {
        this.admin1ID = value;
    }

    public long getAdmin2ID() {
        return admin2ID;
    }

    public void setAdmin2ID(long value) {
        this.admin2ID = value;
    }

    public long getAdmin3ID() {
        return admin3ID;
    }

    public void setAdmin3ID(long value) {
        this.admin3ID = value;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String value) {
        this.timezone = value;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long value) {
        this.population = value;
    }

    public String[] getPostcodes() {
        return postcodes;
    }

    public void setPostcodes(String[] value) {
        this.postcodes = value;
    }

    public long getCountryID() {
        return countryID;
    }

    public void setCountryID(long value) {
        this.countryID = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

    public String getAdmin1() {
        return admin1;
    }

    public void setAdmin1(String value) {
        this.admin1 = value;
    }

    public String getAdmin2() {
        return admin2;
    }

    public void setAdmin2(String value) {
        this.admin2 = value;
    }

    public String getAdmin3() {
        return admin3;
    }

    public void setAdmin3(String value) {
        this.admin3 = value;
    }
}
