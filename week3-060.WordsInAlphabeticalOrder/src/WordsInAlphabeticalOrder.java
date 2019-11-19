
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        String word;
        Scanner reader = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        do {
        System.out.println("Type a word: ");
        word = reader.nextLine();
        names.add(word);
        } while (!word.equals(""));
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
        
    }
}
