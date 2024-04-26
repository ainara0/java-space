package Space.Domain;

import java.util.List;

abstract class CelestialBody {
    private String name;
    private String identifier;
    private int radius;
    private int mass;
    private int density;
    private int temperature;
    private String composition;
    private boolean habitable;
    abstract void explode();
    private List<CelestialBody> orbit;
}
