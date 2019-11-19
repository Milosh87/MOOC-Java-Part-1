
import java.util.ArrayList;
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            ArrayList<Bird> ptice = new ArrayList<Bird>();
            while(true){
            String rec = sc.nextLine();
            if (rec.equals("Quit")) {
                break;
            }
            if(rec.equals("Add")){
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Latin name: ");
                 String latinName = sc.nextLine();
                 Bird ptica = new Bird(name, latinName);
                 ptice.add(ptica);
            } else if (rec.equals("Observation")){
                System.out.println("What was observed:");
                String observation = sc.nextLine();
                boolean ima = false;
                for (Bird p: ptice){
                      if (p.getName().contains(observation)) {
                        p.addObservation();
                        ima = true;
                    } 
                }
                if (!ima){
                    System.out.println("Is not a bird!");
                } 
                
            } else if (rec.equals("Statistics")) {
                for(Bird p: ptice){
                    System.out.println(p);
                }
            }
            else if (rec.equals("Show")) {
                System.out.println("What?");
                String what = sc.nextLine();
               for (Bird p: ptice){
                      if (p.getName().contains(what)) {
                          System.out.println(p);
                    } 
            }
            }
            }
    }
}


