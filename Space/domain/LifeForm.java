package Space.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class LifeForm {
    private String name;
    private int intelligence;
    private int strength;
    private Faction faction;
    private List<Species> species = new ArrayList<Species>();
    static private List<LifeForm> lifeForms = new ArrayList<LifeForm>();

    public static List<LifeForm> getLifeForms() {
        return new ArrayList<LifeForm>(lifeForms);
    }

    public LifeForm(String name, int intelligence, int strength, Faction faction, List<Species> species) {
        this.name = name;
        this.intelligence = intelligence;
        this.strength = strength;
        this.faction = faction;
        this.species = species;
    }

    public LifeForm(String name, Random r, List<Species> species, Faction faction) {
        this.name = name;
        this.intelligence = (int) (r.nextGaussian() * 100);;
        this.strength = (int) (r.nextGaussian() * 100);;
        this.species = species;
        this.faction = faction;
    }

    public void joinFaction(Faction faction) {
        this.faction = faction;
        faction
    }
}
