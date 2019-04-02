package com.devitis.acympkv2_290319.maps.data.model;

import java.util.List;

/**
 * Created by Diana on 02.04.2019.
 */

public class Direction {

    private List<Routes> routes;

    public List<Routes> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Routes> routes) {
        this.routes = routes;
    }

    public Direction(List<Routes> routes) {
        this.routes = routes;
    }
}
