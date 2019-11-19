/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;
    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    public void next() {
        value++;
        if(value > upperLimit) {
            value = 0;
        }
       
    }
    public String toString() {
        if (value <10){
        return "0" + value;
    } else return "" + value;

        
}
    public int getValue() {
        return value;
    }
    public void setValue(int s) {
        if (s >=0 && s <= upperLimit) {
            this.value = s;
        }
    }
    
}