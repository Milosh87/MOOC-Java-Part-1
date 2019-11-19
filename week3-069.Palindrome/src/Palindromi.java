import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        
        return reverse(text).equals(text);
    }
    public static String reverse(String word) {
       String reverse= "";
        for (int i = word.length()-1; i >= 0; i--) {
           reverse += word.charAt(i);
       }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();  
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
