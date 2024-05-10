package Space.domain;

import java.util.List;
import java.util.Random;

public class Star extends CelestialBody{
    private int brightness;

    public Star(String name, String identifier, int radius, int mass, int temperature, String composition, List<CelestialBody> orbit, int brightness) {
        super(name, identifier, radius, mass, temperature, composition, orbit);
        this.brightness = brightness;
    }
    public Star(String name, String identifier, String composition, Random r) {
        super(name, identifier, composition, r);
        this.temperature = r.nextInt(47500) + 2501;
    }
    @Override
    public String toString() {
        return "Star{" +
                "brightness=" + brightness +
                ", name='" + name + '\'' +
                ", identifier='" + identifier + '\'' +
                ", radius=" + radius +
                ", mass=" + mass +
                ", temperature=" + temperature +
                ", composition='" + composition + '\'' +
                ", orbit=" + this.getOrbitNames() +
                '}';
    }
    @Override
    void explode() {
        for (CelestialBody body : orbit) {
            body.pullToBlackHole();
        }
        new BlackHole(name, identifier, radius, brightness);
    }
    @Override
    void pullToBlackHole() {
        for (CelestialBody body : orbit) {
            body.pullToBlackHole();
        }
        celestialBodies.remove(this);
    }
}
