package com.wilhelm.prisacaru_konsza;

public class Moon extends CelestialBody {
    public Moon(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
    }

    @Override
    public boolean addSatellites(CelestialBody satellite) {
        return false;
    }
}
