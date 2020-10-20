package org.pixel.model;

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
        return Float.compare(nnPlace.latitude, latitude) == 0 &&
                Float.compare(nnPlace.longitude, longitude) == 0 &&
                Objects.equals(name, nnPlace.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, name);
    }
}
