package com.wilhelm.prisacaru_konsza;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SolarSystem {
    private final Map<String, CelestialBody> solarSys;
    private final Set<CelestialBody> planets;
    

    public SolarSystem(Map<String, CelestialBody> solarSystem, Set<CelestialBody> planets) {
        this.solarSys = new HashMap<>(solarSystem);
        this.planets = new HashSet<>(planets);
    }

    public SolarSystem() {
        this.solarSys = new HashMap<>();
        this.planets = new HashSet<>();
    }

    public boolean addToSolarSystem(String planetName, CelestialBody celestialBody) {
        if (!this.solarSys.containsKey(planetName)) {
            this.solarSys.put(planetName, celestialBody);
            return true;
        }
        return false;
    }

    public boolean addToPlanets(CelestialBody celestialBody) {
        return this.planets.add(celestialBody);
    }

    public Map<String, CelestialBody> getSolarSys() {
        return new HashMap<>(solarSys);
    }

    public Set<CelestialBody> getPlanets() {
        return new HashSet<>(planets);

    }
}
