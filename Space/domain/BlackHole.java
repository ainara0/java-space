package Space.domain;

import java.util.ArrayList;
import java.util.List;

public class BlackHole{
    private String name;
    private String identifier;
    private int radius;
    private int brightness;
    private static List<BlackHole> blackHoles = new ArrayList<BlackHole>();
    public BlackHole(String name, String identifier, int radius, int brightness) {
        this.name = name;
        this.identifier = identifier;
        this.radius = radius;
        this.brightness = brightness;
        blackHoles.add(this);
    }
    public String getName() {
        return name;
    }
    public String getIdentifier() {
        return identifier;
    }
    public int getRadius() {
        return radius;
    }
    public static List<BlackHole> getBlackHoles() {
        return blackHoles;
    }
}
