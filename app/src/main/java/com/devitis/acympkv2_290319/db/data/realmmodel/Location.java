package com.devitis.acympkv2_290319.db.data.realmmodel;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Diana on 29.03.2019.
 */

public class Location extends RealmObject {

    @PrimaryKey
    private String id;

    private String name;
    private String lat;
    private String lon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLocation() {
        return String.format("%s, %s", getLat(), getLon());
    }
}
