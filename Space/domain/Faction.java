package Space.domain;

import java.util.ArrayList;
import java.util.List;

public class Faction {
    private String name;
    private int development;
    private static List<Faction> factions = new ArrayList<Faction>();
    private List<LifeForm> members;
    private List<LifeForm> allies;
    private List<LifeForm> enemies;
    private List<Planet> colonies;

    public Faction(String name) {
        this.name = name;
        development = 0;
        members = new ArrayList<LifeForm>();
        allies = new ArrayList<LifeForm>();
        enemies = new ArrayList<LifeForm>();
        colonies = new ArrayList<Planet>();
        factions.add(this);
    }
    public String getName() {
        return name;
    }
    public int getDevelopment() {
        return development;
    }
    public static List<Faction> getFactions() {
        return factions;
    }
    public List<LifeForm> getMembers() {
        return members;
    }
    public List<LifeForm> getAllies() {
        return allies;
    }
    public List<LifeForm> getEnemies() {
        return enemies;
    }
    public List<Planet> getColonies() {
        return colonies;
    }
    public int getCombinedIntelligence(){
        int combinedIntelligence = 0;
        for (LifeForm lifeForm : members) {
            combinedIntelligence +=(lifeForm.getIntelligence());
        }
        return combinedIntelligence;
    }
    public int getCombinedStrength(){
        int combinedStrength = 0;
        for (LifeForm lifeForm : members) {
            combinedStrength +=(lifeForm.getStrength());
        }
        return combinedStrength;
    }
    public int getCombinedHealth(){
        int combinedHealth = 0;
        for (LifeForm lifeForm : members) {
            combinedHealth +=(lifeForm.getHealth());
        }
        return combinedHealth;
    }
    public int getAverageIntelligence(){
        return getCombinedIntelligence() / members.size();
    }
    public int getAverageStrength(){
        return getCombinedStrength() / members.size();
    }
    public int getAverageHealth(){
        return getCombinedHealth() / members.size();
    }
    public boolean empty() {
        return members.isEmpty();
    }
    void addToFaction(LifeForm member) {
        members.add(member);
    }
    void removeFromFaction(LifeForm member) {
        members.remove(member);
    }
    public int colonise(Planet planet){
        if(!planet.getFactions().isEmpty()) {
            return 1;
        } else if (colonies.contains(planet)) {
            return 2;
        }
        planet.addFaction(this);
        return 0;
    }
    public boolean declareWar(Faction faction) {
        return true;
    }
    public void attack(Faction enemy){
    }
    public void leavePlanet(Planet planet) {
        colonies.remove(planet);
    }
}
