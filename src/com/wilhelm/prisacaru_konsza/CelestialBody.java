package com.wilhelm.prisacaru_konsza;

import java.util.HashSet;
import java.util.Set;

public final class CelestialBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<CelestialBody> satellites;

    public CelestialBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return this.name;
    }

    public double getOrbitalPeriod() {
        return this.orbitalPeriod;
    }

    public boolean addMoon(CelestialBody moon) {
        if (moon != null && !satellites.contains(moon)) {
            return this.satellites.add(moon);
        } else {
            return false;
        }
    }

    public Set<CelestialBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    @Override
    public String toString() {
        return "CelestialBody{" +
                "name='" + name + '\'' +
                ", orbitalPeriod=" + orbitalPeriod +
                ", satellites=" + satellites +
                "}\n";
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof CelestialBody && o != null) {
            CelestialBody temp = (CelestialBody) o;
            if (temp.name.equals(temp.getName())) {
                return true;
            }
        }

        return false;
    }

}
