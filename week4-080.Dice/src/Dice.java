import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        return (random.nextInt(this.numberOfSides)+1) ;
        // create here a random number belongig to range 1-numberOfSided
 
    }
}
