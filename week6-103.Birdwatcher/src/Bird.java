/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Bird {
    private String name;
    private String latinName;
    private int observation;
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public int getObservation() {
        return observation;
    }
     public String getName() {
        return name;
    }
     public void addObservation() {
        observation++;
    }
     
     public String toString() {
         return name + "(" + latinName + "):" + observation + "observations";
     }

}
