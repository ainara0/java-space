package Space.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Species {
    private final String name;
    private final int intelligenceModifier;
    private final int strengthModifier;
    private static List<Species> species = new ArrayList<Species>();
    private List<LifeForm> lifeForms = new ArrayList<LifeForm>();

    public Species(String name, Random r) {
        this.name = name;
        intelligenceModifier = r.nextInt(10);
        strengthModifier = r.nextInt(10);
        species.add(this);
    }
    public String getName() {
        return name;
    }

    public int getIntelligenceModifier() {
        return intelligenceModifier;
    }

    public int getStrengthModifier() {
        return strengthModifier;
    }

    public List<LifeForm> getLifeForms() {
        return new ArrayList<LifeForm>(lifeForms);
    }
    public static List<Species> getSpecies() {
        return new ArrayList<Species>(species);
    }
    @Override
    public String toString() {
        return "Species{" +
                "name='" + name + '\'' +
                ", intelligenceModifier=" + intelligenceModifier +
                ", strengthModifier=" + strengthModifier +
                ", lifeForms=" + lifeForms +
                '}';
    }
    public boolean extinct() {
        return lifeForms.isEmpty();
    }
    public void addLifeForm(LifeForm lifeForm) {
        lifeForms.add(lifeForm);
    }
    public void removeLifeForm(LifeForm lifeForm) {
        lifeForms.remove(lifeForm);
    }
}
