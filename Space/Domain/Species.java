package Space.Domain;

import java.util.ArrayList;
import java.util.List;

public class Species {
    private String name;
    private int intelligenceModifier;
    private int strengthModifier;
    private int age;
    private static List<Species> species = new ArrayList<Species>();
    private List<LifeForm> lifeForms = new ArrayList<LifeForm>();

    public List<LifeForm> getLifeForms() {
        return new ArrayList<LifeForm>(lifeForms);
    }
    public static List<Species> getSpecies() {
        return new ArrayList<Species>(species);
    }
    public boolean extinct() {
        return lifeForms.isEmpty();
    }
}
