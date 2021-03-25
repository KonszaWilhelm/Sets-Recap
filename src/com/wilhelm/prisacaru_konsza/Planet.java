package com.wilhelm.prisacaru_konsza;

public class Planet extends CelestialBody {
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
    }

    @Override
    public boolean addSatellites(CelestialBody satellite) {
        if (satellite.getClass() == Moon.class)
            return super.addSatellites(satellite);
        else
            return false;
    }
}
