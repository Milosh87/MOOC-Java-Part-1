
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";// Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.print("Type the password: ");
            String passInput = reader.nextLine();
            if (passInput.equals(password)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }

        }
        System.out.println("");
        System.out.println("The secret is: jryy qbar!");
    }
}
