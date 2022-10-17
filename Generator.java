import java.util.Random;

public class Generator {
    private Random random;

    public int getRandom(int min, int max) {
        if (random == null) random = new Random();
        return random.nextInt(min, max);
    }

    public static void main(String[] args) {
        var generator = new Generator();
        System.out.println(generator.getRandom(10, 15));
    }
}