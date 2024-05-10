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
    protected static List<CelestialBody> celestialBodies;
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
}
