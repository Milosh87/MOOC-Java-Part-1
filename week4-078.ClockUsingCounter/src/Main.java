
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        System.out.print("seconds: ");
        int s = sc.nextInt();// read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m = sc.nextInt();// read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = sc.nextInt();// read the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes + ":" + seconds);  
              if (minutes.getValue() == 59 && seconds.getValue() == 59 &&hours.getValue() == 23) {
                hours.next();
            }
            if(seconds.getValue() == 59) {
                minutes.next();
            }
            
          
            
           
          
 
             // the current time printed
            // advance minutes
            // if minutes become zero, advance hours
            seconds.next();
            i++;
        }
    }
}
