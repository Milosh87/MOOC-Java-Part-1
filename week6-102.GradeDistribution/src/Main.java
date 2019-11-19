import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Graph g1 = new Graph();
        int n;
        while(true) {
            n = lukija.nextInt();
              if (n == -1) {
                break;
            }
            if (n < 0 || n > 60) {
                continue;
            }
            
            g1.addGrade(n);
           
    
            
        }
                g1.ispisGraph();
    }
}
