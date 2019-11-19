
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String user1 = "alex";
        String user1Pass = "mightyducks";
        String user2 = "emily";       
        String user2Pass = "cat";

        System.out.print("Type your username: ");
        String inputUser = reader.nextLine();
        System.out.print("Type your password: ");
        String inputPass = reader.nextLine();
        
        
        if ((inputUser.equals(user1) && inputPass.equals(user1Pass)) || (inputUser.equals(user2) && inputPass.equals(user2Pass))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password is invalid!");
        }

    }
}
