
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int i = 0;
        while (true) {
            int x;
            System.out.print("Guess a number: ");
            x = reader.nextInt();
            i++;
            if (numberDrawn > x) {
                System.out.printf("The number is greater, guesses made %d\n", i);
                i++;
            } else if (numberDrawn < x) {
                System.out.printf("The number is lesser, guesses made %d\n", i);
                i++;
            } else {
                System.out.printf("Congratulations, your guess is correct!");
                break;
            }
        }
        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
