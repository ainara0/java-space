package Space.domain;

import java.util.Random;

public class HealingTool implements Tool {
    private int healing;
    private int durability;
    private LifeForm owner;

    public HealingTool(LifeForm lifeForm, Random r) {
        owner = lifeForm;
        healing = r.nextInt(10) + 1;
        durability = r.nextInt(10) + 1;
    }
    public int getHealing() {
        return healing;
    }
    public int getDurability() {
        return durability;
    }
    public LifeForm getOwner() {
        return owner;
    }
    public void setOwner(LifeForm owner) {
        this.owner = owner;
    }
    public void use(LifeForm lifeForm){
        lifeForm.heal(healing);
        durability -= 1;
        if (durability == 0) {
            this.shatter();
        }
    }
    public void shatter() {
        owner.loseTool(this);
    }

    @Override
    public void seize() {

    }
}
