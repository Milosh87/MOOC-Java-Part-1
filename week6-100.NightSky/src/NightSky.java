
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint=0;
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    public NightSky(int width, int height) {
        this(0.1, width, height);
    }
    public NightSky(double density){
        this(density, 20, 10);
    }
    public void printLine() {
        Random r = new Random();
        String [] zvezde = new String[width];
        for (int i=0; i<zvezde.length;i++) {

            if (r.nextDouble()*1.0 <= density) {
                zvezde[i] = "*";
                starsInLastPrint++;
            } else zvezde[i] = " ";
        }
       
        for (int i=0; i<zvezde.length; i++) {
            if (i!= zvezde.length-1){
            System.out.print(zvezde[i]);
            } else System.out.print(zvezde[i] + "\n");
        }
       
    }
    public void print() {
        starsInLastPrint=0;
        for (int i=0; i<height; i++) {
            printLine();
        }
    }
    public int starsInLastPrint(){
        return starsInLastPrint;
    }
}
