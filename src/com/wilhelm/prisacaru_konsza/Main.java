package com.wilhelm.prisacaru_konsza;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SolarSystem solarSystem = new SolarSystem();
        CelestialBody mercury = new CelestialBody("Mercury", 88);
        solarSystem.addToSolarSystem(mercury.getName(), mercury);
        solarSystem.addToPlanets(mercury);

        CelestialBody venus = new CelestialBody("Venus", 225);
        solarSystem.addToSolarSystem(venus.getName(), venus);
        solarSystem.addToPlanets(venus);

        CelestialBody earth = new CelestialBody("Earth", 365);
        solarSystem.addToSolarSystem(earth.getName(), earth);
        solarSystem.addToPlanets(earth);

        CelestialBody tempMoon = new CelestialBody("Moon", 27);
        solarSystem.addToSolarSystem(tempMoon.getName(), tempMoon);
        earth.addMoon(tempMoon);

        CelestialBody tempPlanet = new CelestialBody("Mars", 687);
        solarSystem.addToSolarSystem(tempPlanet.getName(), tempPlanet);
        solarSystem.addToPlanets(tempPlanet);

        tempMoon = new CelestialBody("Deimos", 1.3);
        solarSystem.addToSolarSystem(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempPlanet = new CelestialBody("Phobos", 0.3);
        solarSystem.addToSolarSystem(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempPlanet = new CelestialBody("Jupiter", 4332);
        solarSystem.addToSolarSystem(tempPlanet.getName(), tempPlanet);
        solarSystem.addToPlanets(tempPlanet);

        tempMoon = new CelestialBody("Io", 1.8);
        solarSystem.addToSolarSystem(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempMoon = new CelestialBody("Europa", 3.5);
        solarSystem.addToSolarSystem(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempMoon = new CelestialBody("Ganymede", 7.1);
        solarSystem.addToSolarSystem(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempMoon = new CelestialBody("Callisto", 16.7);
        solarSystem.addToSolarSystem(tempMoon.getName(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempPlanet = new CelestialBody("Saturn", 10759);
        solarSystem.addToSolarSystem(tempPlanet.getName(), tempPlanet);
        solarSystem.addToPlanets(tempPlanet);

        tempPlanet = new CelestialBody("Uranus", 30660);
        solarSystem.addToSolarSystem(tempPlanet.getName(), tempPlanet);
        solarSystem.addToPlanets(tempPlanet);

        tempPlanet = new CelestialBody("Neptune", 165);
        solarSystem.addToSolarSystem(tempPlanet.getName(), tempPlanet);
        solarSystem.addToPlanets(tempPlanet);

        tempPlanet = new CelestialBody("Pluto", 248);
        solarSystem.addToSolarSystem(tempPlanet.getName(), tempPlanet);
        solarSystem.addToPlanets(tempPlanet);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + tempPlanet.hashCode());

        tempPlanet = new CelestialBody("Pluto", 248);
        solarSystem.addToSolarSystem(tempPlanet.getName(), tempPlanet);
        solarSystem.addToPlanets(tempPlanet);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + tempPlanet.hashCode());


        Set<CelestialBody> planets = new HashSet<>(solarSystem.getPlanets());
        for (CelestialBody cp : planets
        ) {
            System.out.println(cp.getName());
            System.out.println(cp.getName().hashCode());
        }


        System.out.println(solarSystem.getSolarSys().get("Jupiter").getSatellites());


        System.out.println("-------------------------------------------------------------------");
        Set<CelestialBody> moons = new HashSet<>();

        for (CelestialBody planet : solarSystem.getPlanets()
        ) {
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All moons set union:\n " + moons);

       


    }
}
