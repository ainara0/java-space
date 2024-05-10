package Space.domain;

public class DefensiveTool {
    private int protection;
    private int durability;

    public void use(LifeForm lifeForm){
        lifeForm.heal(healing);
        durability -= 1;
        if (durability == 0) {
            this.shatter();
        }
    }
}
