
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Phonebook {
    private ArrayList<Person> lista = new ArrayList<Person>();
    
    public void add(String name, String number) {
        lista.add(new Person(name, number)); 
    }
    public void printAll() {
        for(Person p:  lista) {
        System.out.println(p);
    }
    }
    public String searchNumber(String name) {
        for (Person p: lista) {
            if(p != null && name != null && p.getName() == name) {
                return p.getNumber();
            }
        }
        return "number not known";
    }
}
