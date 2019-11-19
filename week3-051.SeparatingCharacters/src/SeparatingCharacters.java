
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        String name;
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        name = reader.nextLine();
        for (int i=0; i < name.length(); i++) {
            System.out.println(i+1 + ". character: " + name.charAt(i));
        }
    }
}
