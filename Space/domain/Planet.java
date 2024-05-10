package Space.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Planet extends CelestialBody{
    private List<Faction> factions;

    public Planet(String name, String identifier, int radius, int mass, int temperature, String composition, List<CelestialBody> orbit) {
        super(name, identifier, radius, mass, temperature, composition, orbit);
        this.factions = new ArrayList<Faction>();
    }
    public Planet(String name, String identifier, String composition, Random r) {
        super(name, identifier, composition, r);
        this.temperature = r.nextInt(2500) + 1;
    }
    public List<Faction> getFactions() {
        return factions;
    }
    public boolean habitable() {
        return temperature > -10 && temperature < 50 && mass < 7000;
    }
    public void addFaction(Faction faction) {
        factions.add(faction);
    }
    public void removeFaction(Faction faction) {
        factions.remove(faction);
    }
    @Override
    public String toString() {
        return "Planet{" +
                "factions=" + factions +
                ", name='" + name + '\'' +
                ", identifier='" + identifier + '\'' +
                ", radius=" + radius +
                ", mass=" + mass +
                ", temperature=" + temperature +
                ", composition='" + composition + '\'' +
                ", orbit=" + this.getOrbitString() +
                '}';
    }
    @Override
    void explode() {
        for (Faction faction : factions) {
            faction.leavePlanet(this);
            celestialBodies.remove(this);
        }
    }
    @Override
    void pullToBlackHole() {
        for (CelestialBody body : orbit) {
            body.pullToBlackHole();
        }
        this.explode();
    }
}
