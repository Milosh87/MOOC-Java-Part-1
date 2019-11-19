
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner sc = new Scanner(System.in);
        String name;
        String number;
        ArrayList<Student> list = new ArrayList<Student>();
        while(true){
            System.out.print("name: ");
            name=sc.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("studentNumber: ");
            number=sc.nextLine();
            list.add(new Student(name, number));
        } 
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("Give search term: ");
        String search = sc.nextLine();
        System.out.println("result");
        for (Student student: list) {
            if(student.getName().contains(search)) {
                System.out.println(student);
            }
        }
    }
}
