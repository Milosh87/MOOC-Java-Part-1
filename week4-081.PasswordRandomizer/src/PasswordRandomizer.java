import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random r = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        
    }

    public String createPassword() {
        String randomPass = "";
        for (int i =0; i<length; i++) {
            randomPass += "abcdefghijklmnopqrstuvwxyz".charAt(r.nextInt(26));
        }
        // write code that returns a randomized password
        return randomPass;
    }
}
