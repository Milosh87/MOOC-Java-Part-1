/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
public class Grade {
    private int points;
    public Grade(int points) { 
        this.points = points;
    }
    public int getPoints(){
        return points;
    }
    public int ocena() {
        if (points < 30) {
            return 0;
        } else if (points < 35) {
            return 1;
        } else if (points < 40) {
            return 2;
        } else if (points < 45) {
            return 3;
        } else if (points < 50) {
            return 4;
        } else {
            return 5;
        }    
    }
}
