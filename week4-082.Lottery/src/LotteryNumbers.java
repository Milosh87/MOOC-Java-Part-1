import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random r = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int n;
        for (int i=0; i < 7; i++) {
            do {
             n = r.nextInt(39) +1;
            } while(this.containsNumber(n) == true);
            numbers.add(n);
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
