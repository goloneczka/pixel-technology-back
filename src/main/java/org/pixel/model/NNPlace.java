package org.pixel.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class NNPlace {

    private float latitude;
    private float longitude;
    private String name;

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public NNPlace() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public NNPlace(float latitude, float longitude, String name) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NNPlace nnPlace = (NNPlace) o;
        return Objects.equals(latitude, nnPlace.latitude) &&
                Objects.equals(longitude, nnPlace.longitude) &&
                Objects.equals(name, nnPlace.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, name);
    }

    public void setLatitudeFromString(String latitude){
        this.latitude = Float.parseFloat(latitude);
    }
    public void setLongitudeFromString(String longitude){
        this.longitude = Float.parseFloat(longitude);
    }
}
