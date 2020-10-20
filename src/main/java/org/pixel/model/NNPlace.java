package org.pixel.model;

import java.util.Objects;

public class NNPlace {

    private String latitude;
    private String longitude;
    private String name;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
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

    public NNPlace(String latitude, String longitude, String name) {
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

}
