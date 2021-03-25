package com.wilhelm.prisacaru_konsza;

import java.util.HashSet;
import java.util.Set;

public abstract class CelestialBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<CelestialBody> satellites;
    private final String bodyType;

    public CelestialBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = getClass().getSimpleName();
    }


    public String getName() {
        return this.name;
    }

    public double getOrbitalPeriod() {
        return this.orbitalPeriod;
    }

    public boolean addSatellites(CelestialBody satellite) {
        if (satellite != null && !satellites.contains(satellite)) {
            return this.satellites.add(satellite);
        } else {
            return false;
        }

    }

    public Set<CelestialBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return "CelestialBody{" +
                "name='" + name + '\'' +
                ", orbitalPeriod=" + orbitalPeriod +
                ", satellites=" + satellites +
                ", body type= " + bodyType +
                "}\n";
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }


    @Override
    public final boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof CelestialBody && o != null) {
            CelestialBody temp = (CelestialBody) o;
            if (temp.name.equals(temp.getName())) {
                return this.bodyType.equals(temp.getBodyType());
            }
        }

        return false;
    }

}
