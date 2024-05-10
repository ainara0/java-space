package Space.domain;

import java.util.Random;

public class OffensiveTool implements Tool {
    private int damage;
    private int durability;
    private LifeForm owner;

    public OffensiveTool(LifeForm lifeForm, Random r) {
        owner = lifeForm;
        damage = r.nextInt(10) + 1;
        durability = r.nextInt(10) + 1;
    }
    public int getDamage() {
        return damage;
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
        lifeForm.damage(damage);
        durability -= 1;
        if (durability == 0) {
            this.shatter();
        }
    }
    @Override
    public void shatter() {
        owner.loseTool(this);
    }
    @Override
    public void seize() {
    }
}
