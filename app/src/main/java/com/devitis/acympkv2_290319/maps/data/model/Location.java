package com.devitis.acympkv2_290319.maps.data.model;

/**
 * Created by Diana on 02.04.2019.
 */

public class Location {

    private Double lat;
    private Double lng;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Location(Double lat, Double lng) {
        this.lat = lat;
        this.lng = lng;
    }
}
