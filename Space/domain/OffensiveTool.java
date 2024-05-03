package Space.domain;

public class OffensiveTool {
    private int damage;
    private int durability;
    public void use(LifeForm lifeForm){
        lifeForm.damage(damage);
    }
}
