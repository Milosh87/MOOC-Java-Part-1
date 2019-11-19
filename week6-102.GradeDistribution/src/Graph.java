
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
public class Graph {
    private ArrayList<Grade> ocene = new ArrayList<Grade>();
    
    
    public void addGrade(int n) {
        ocene.add(new Grade(n));
    }
    
    
    
    public double average() {
        double sum = 0;
        for (int i=0; i<ocene.size(); i++) {
           sum += ocene.get(i).ocena();
        }
        return sum/ocene.size();
    }
    
    public void ispisGraph() {
        int [] a = {0,0,0,0,0,0};
        for (int i=0; i<ocene.size(); i++) {
            a[(ocene.get(i).ocena())]++;
            
        }
        System.out.println("Grade distribution:");
        for(int i=a.length-1; i>=0; i--) {
            System.out.print(i + ": ");
            for(int j=0;j<a[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
        double sum=0;
        double sumaSvih=0;
        for (int i=0; i<a.length; i++) { 
            if(i!= 0){
            sumaSvih += a[i];
            sum+= a[i];
            } else {
                sumaSvih += a[i];
            }
        }
        System.out.println("Acceptance percentage: " + (sum/sumaSvih) *100);
        
        
    }
    
}
