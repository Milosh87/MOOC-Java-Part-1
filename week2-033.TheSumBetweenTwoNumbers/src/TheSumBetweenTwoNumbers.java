
import java.util.Scanner;

public class TheSumBetweenTwoNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int counter = first;
        while (counter <= last) {
            sum += counter;
            counter++;
        }
        System.out.println(sum);
    }
}
