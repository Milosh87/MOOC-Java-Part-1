import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        String word;
        Scanner reader = new Scanner(System.in);
        word = reader.nextLine();
        System.out.print(lastCharacter(word));
    }
    
    public static char lastCharacter(String text) {
        return text.charAt(text.length()-1);
    }
}
