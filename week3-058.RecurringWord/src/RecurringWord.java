
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
       String x;
       while(true){
            System.out.print("Type a word: ");
            x = reader.nextLine();
            if (words.contains(x)){
                break;
            }
            words.add(x);
            
       }
       System.out.printf("You gave the word %s twice\n", x);
    }
}
