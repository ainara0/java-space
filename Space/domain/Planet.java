package Space.domain;

import java.util.ArrayList;
import java.util.List;

public class Planet extends CelestialBody{
    private List<Faction> factions;

    public Planet(String name, String identifier, int radius, int mass, int temperature, String composition, List<CelestialBody> orbit) {
        super(name, identifier, radius, mass, temperature, composition, orbit);
        this.factions = new ArrayList<Faction>();
    }
    public List<Faction> getFactions() {
        return factions;
    }
    public boolean habitable(){
        return temperature > -10 && temperature < 50 && mass < 7000;
    }
    public void addFaction(Faction faction) {
        factions.add(faction);
    }
    public void removeFaction(Faction faction) {
        factions.remove(faction);
    }
    @Override
    void explode() {
    }
}
