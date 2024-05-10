package Space.domain;

public class DefensiveTool implements Tool{
    private int protection;
    private int durability;
    private LifeForm owner;

    public void use(LifeForm lifeForm){
        lifeForm.heal(protection);
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
    public void setOwner(LifeForm lifeForm) {

    }
}
