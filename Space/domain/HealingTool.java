package Space.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HealingTool implements Tool {
    private int healing;
    private int durability;
    private Faction owner;
    private static List<HealingTool> healingTools = new ArrayList<HealingTool>();

    public HealingTool(Random r) {
        healing = r.nextInt(10) + 1;
        durability = r.nextInt(10) + 1;
        healingTools.add(this);
    }
    public int getHealing() {
        return healing;
    }
    public int getDurability() {
        return durability;
    }
    public Faction getOwner() {
        return owner;
    }
    public void setOwner(Faction owner) {
        /*
        this.owner = owner;
        Faction.obtainHealingTool(this);
        */
    }

    public void use(LifeForm lifeForm){
        lifeForm.heal(healing);
        durability -= 1;
        if (durability == 0) {
            this.shatter();
        }
    }

    @Override
    public void shatter() {
        // owner.loseTool(this);
    }

    @Override
    public void seize() {

    }
}
