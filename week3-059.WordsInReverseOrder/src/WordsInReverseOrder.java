import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String x;
        while (true) {
            System.out.print("Type a word: ");
            x = reader.nextLine();
            if (x.equals("")) {
                break;
            }
            words.add(x);
        }
        Collections.reverse(words);
        System.out.println("You typed the following words: ");
        for (String word : words) {
            System.out.println(word);
        }
        
    }
}
