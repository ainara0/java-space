package Space.domain;

import java.util.ArrayList;
import java.util.List;

public class Faction {
    private String name;
    private int development;
    private static List<Faction> factions = new ArrayList<Faction>();
    private List<LifeForm> members;
    private List<Faction> allies;
    private List<Planet> colonies;
    private List<HealingTool> healingTools = new ArrayList<HealingTool>();

    public Faction(String name) {
        this.name = name;
        development = 0;
        members = new ArrayList<LifeForm>();
        allies = new ArrayList<Faction>();
        colonies = new ArrayList<Planet>();
        healingTools = new ArrayList<HealingTool>();
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
    public List<Faction> getAllies() {
        return allies;
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
    @Override
    public String toString() {
        return "Faction{" +
                "name='" + name + '\'' +
                ", development=" + development +
                ", members=" + members +
                ", allies=" + allies +
                ", colonies=" + colonies +
                ", healingTools=" + healingTools +
                '}';
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
    public void colonise(Planet planet){
        planet.addFaction(this);
    }
    public void leavePlanet(Planet planet) {
        colonies.remove(planet);
    }
    public void obtainHealingTool(HealingTool tool) {
        this.healingTools.add(tool);
    }
    public void becomeAllies(Faction faction) {
        allies.add(faction);
    }
    public void disband() {
        for (LifeForm lifeForm : members) {
            lifeForm.leaveFaction();
        }
        factions.remove(this);
    }
    // Methods to add : declareWar, attack, disband
}
