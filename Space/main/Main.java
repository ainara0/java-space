package Space.main;

import Space.domain.*;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        Species humans = new Species("Humans", r);
        System.out.println(humans.toString());
        Faction first = new Faction ("First");
        System.out.println(first.toString());
        List<Species> speciesArrayList = new ArrayList<Species>();
        speciesArrayList.add(humans);
        LifeForm alice = new LifeForm("Alice", speciesArrayList,first);
        System.out.println(alice.toString());
        Star sun = new Star("Sun","Sol","Gas",r);
        Planet earth = new Planet("Earth","1","Water",r);
        Planet mars = new Planet("Mars","23","FIRE",r);
        Planet pluto = new Planet("Pluto","138","Air",r);
        System.out.println(sun.toString());
        sun.addToOrbit(earth);
        sun.addToOrbit(mars);
        earth.addToOrbit(pluto);
        System.out.println(sun.toString());
        System.out.println(earth.toString());
        System.out.println(mars.toString());
        System.out.println(pluto.toString());
    }
}
