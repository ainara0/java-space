package Space.domain;

import java.util.Random;

public interface Tool {
    void use(LifeForm lifeForm);
    void shatter();
    void seize();
    void setOwner(LifeForm lifeForm);
}
