import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int i = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;
        while (i != -1) {
            counter++;
            sum += i;
            if (i % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
            System.out.println("Type numbers: ");
            i = Integer.parseInt(reader.nextLine());
            
        }
        double average = (double)sum / counter;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
