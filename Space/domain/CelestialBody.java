package Space.domain;

import java.util.ArrayList;
import java.util.List;

abstract class CelestialBody {
    protected String name;
    protected String identifier;
    protected int radius;
    protected int mass;
    protected int temperature;
    protected String composition;
    protected List<CelestialBody> orbit;

    abstract void explode();
    public CelestialBody(String name, String identifier, int radius, int mass, int temperature, String composition, List<CelestialBody> orbit) {
        this.name = name;
        this.identifier = identifier;
        this.radius = radius;
        this.mass = mass;
        this.temperature = temperature;
        this.composition = composition;
        this.orbit = new ArrayList<CelestialBody>();
    }
}
