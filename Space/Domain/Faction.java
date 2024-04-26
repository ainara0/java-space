package Space.Domain;

import java.util.ArrayList;
import java.util.List;

public class Faction {
    private int name;
    private int combinedIntelligence;
    private int combinedStrength;
    private int development;
    private static List<Faction> fations = new ArrayList<Faction>();
    private List<LifeForm> lifeForms = new ArrayList<LifeForm>();


    public boolean empty() {
        return lifeForms.isEmpty();
    }

    public void colonise(Planet planet){

    }

    public void attack(Faction enemy){

    }
}
