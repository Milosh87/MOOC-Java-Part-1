import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        String word;
        Scanner reader = new Scanner(System.in);
        word = reader.nextLine();
        System.out.print(firstCharacter(word));
    }
    public static char firstCharacter(String text) {
    return text.charAt(0);
}
}

