package Space.Utilities;

public class Random {
    public static double random(int deviation) {
        double output = 0;
        for (int i = 0; i < deviation; i++) {
            output += Math.random();
        }
        return (output / deviation);
    }
}
