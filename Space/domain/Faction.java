package Space.domain;

import java.util.ArrayList;
import java.util.List;

public class Faction {
    private int name;
    private int development;
    private static List<Faction> factions = new ArrayList<Faction>();
    private List<LifeForm> members = new ArrayList<LifeForm>();


    public boolean empty() {
        return members.isEmpty();
    }

    void addToFaction(LifeForm member) {
        members.add(member);
    }

    public int combinedIntelligence;

    public int combinedStrength;

    public void colonise(Planet planet){

    }

    public void attack(Faction enemy){

    }

}
