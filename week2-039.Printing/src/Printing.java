public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times   

        while (amount > 0) {
        System.out.print("*");
        amount--;
    }
        System.out.print("\n");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int number = sideSize;
        while (sideSize > 0) {
            printStars(number);
            sideSize--;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int counter = 1;
        while (counter <= height) {
            printStars(width);
            counter++;
            }
            
        }
       
    

    public static void printTriangle(int size) {
        // 39.4
        int counter = 1;
        while (counter <= size) {
            printStars(counter);
            counter++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        printStars(4);
        printStars(5);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(4, 2);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
