/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Counter {
    private int value;
    private boolean check;
    public Counter(int value, boolean check) {
        this.value = value;
        this.check = check;
    }
    public Counter(int value) {
        this(value, false);
    }
    public Counter(boolean check) {
        this(0, check);
    }
    public Counter(){
        this(0, false);
    }
    public int value() {
        return value;
    }
    public void increase() {
        value++;
    }
     public void decrease() {
         if(value ==0 && check == true){
             value = 0;
         }
         else{
        value--;
         }
    }
     public void increase(int n) {
         if(n >0) {
        value += n;
         }
    }
     public void decrease(int n) {
         if(n > 0){
         value -= n;
         if(value <=0 && check == true){
             value = 0;
         }
         }
    }
}
