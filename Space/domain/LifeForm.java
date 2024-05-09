package Space.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

public class LifeForm {
    private String name;
    private final int intelligence;
    private final int strength;
    private int health;
    private Faction faction;
    private List<Species> species;
    static private List<LifeForm> lifeForms = new ArrayList<LifeForm>();
    private List<Tool> tools;

    public LifeForm(String name, int intelligence, int strength, Faction faction, List<Species> species) {
        this.name = name;
        this.intelligence = intelligence;
        this.strength = strength;
        this.faction = faction;
        this.species = species;
        health = 100;
        tools = new ArrayList<Tool>;
    }
    public LifeForm(String name, List<Species> species, Faction faction) {
        Random r = new Random();
        this.name = name;
        this.intelligence = (int) (abs(r.nextGaussian() + 5) * 10);;
        this.strength = (int) (abs(r.nextGaussian() + 5) * 10);;
        this.species = species;
        this.faction = faction;
        health = 100;
    }
    public String getName() {
        return name;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getStrength() {
        return strength;
    }
    public int getHealth() {
        return health;
    }
    public Faction getFaction() {
        return faction;
    }
    public List<Species> getSpecies() {
        return new ArrayList<Species>(species);
    }
    public static List<LifeForm> getLifeForms() {
        return new ArrayList<LifeForm>(lifeForms);
    }
    public List<Tool> getTools() {
        return tools;
    }
    public void damage(int amount) {
        health -= amount;
    }
    public void heal(int amount) {
        health += amount;
    }
    public void die(){
        lifeForms.remove(this);
        faction.removeFromFaction(this);
        for (Species s : species) {
            s.removeLifeForm(this);
        }
    }
    public void joinFaction(Faction faction) {
        this.faction = faction;
        faction.addToFaction(this);
    }
    public void obtainTool(Tool tool) {
        tools.add(tool);
        tool.setOwner(this);
    }
    public void loseTool(Tool tool) {
        tools.remove(tool);
    }
}
