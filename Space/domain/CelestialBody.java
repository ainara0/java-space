package Space.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class CelestialBody {
    protected String name;
    protected String identifier;
    protected int radius;
    protected int mass;
    protected int temperature;
    protected String composition;
    protected List<CelestialBody> orbit;
    protected static List<CelestialBody> celestialBodies = new ArrayList<CelestialBody>();

    abstract void explode();
    abstract void pullToBlackHole();
    public CelestialBody(String name, String identifier, int radius, int mass, int temperature, String composition, List<CelestialBody> orbit) {
        this.name = name;
        this.identifier = identifier;
        this.radius = radius;
        this.mass = mass;
        this.temperature = temperature;
        this.composition = composition;
        this.orbit = new ArrayList<CelestialBody>();
        celestialBodies.add(this);
    }
    public CelestialBody(String name, String identifier, String composition, Random r) {
        this.name = name;
        this.identifier = identifier;
        this.radius = r.nextInt(10000) + 1;
        this.mass = r.nextInt(10000) + 1;
        this.composition = composition;
        this.orbit = new ArrayList<CelestialBody>();
        celestialBodies.add(this);
    }
    public String getName() {
        return name;
    }
    public String getIdentifier() {
        return identifier;
    }
    public int getRadius() {
        return radius;
    }
    public int getMass() {
        return mass;
    }
    public int getTemperature() {
        return temperature;
    }
    public String getComposition() {
        return composition;
    }
    public List<CelestialBody> getOrbit() {
        return orbit;
    }
    public static List<CelestialBody> getCelestialBodies() {
        return celestialBodies;
    }
    public String getOrbitNames() {
        List<String> orbitString = new ArrayList<String>(orbit.size());
        for (CelestialBody body : orbit) {
            orbitString.add(body.getName());
        }
        return orbitString.toString();
    }
    public void addToOrbit(CelestialBody body){
        orbit.add(body);
    }
}
