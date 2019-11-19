
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
public class Library {
    private ArrayList<Book> knjige;
    public Library(){
        knjige = new ArrayList<Book>();
    }
    public void addBook(Book x) {
        knjige.add(x);
    }
    public void printBooks() {
        for (int i=0; i<knjige.size(); i++){
        System.out.println(knjige.get(i));
        }
    }
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> k2 = new ArrayList<Book>();
        for (Book k: knjige) {
            if(k.title().contains(title)) {
                k2.add(k);
            }
        }
        return k2;
    }
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> k2 = new ArrayList<Book>();
        for (Book k: knjige) {
            if(StringUtils.included(k.publisher(), publisher)) {
                k2.add(k);
            }
        }
        return k2;

    }
    public ArrayList<Book> searchByYear(int year) {
         ArrayList<Book> k2 = new ArrayList<Book>();
        for (Book k: knjige) {
            if(k.year() == year) {
                k2.add(k);
            }
        }
        return k2;
    }
}
