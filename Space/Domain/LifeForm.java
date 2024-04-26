package Space.Domain;

import java.util.ArrayList;
import java.util.List;

abstract class LifeForm {
    private int name;
    private int intelligence;
    private int strength;
    private List<Species> species = new ArrayList<Species>();
    static private List<LifeForm> lifeForms = new ArrayList<LifeForm>();

    public static List<LifeForm> getLifeForms() {
        return new ArrayList<LifeForm>(lifeForms);
    }
}
