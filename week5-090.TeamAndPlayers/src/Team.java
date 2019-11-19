/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milos
 */
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> listaIgraca= new ArrayList<Player>(); 
    private int maxSize=16;
    public Team(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void addPlayer(Player x) {
        listaIgraca.add(x);
    }
    public void printPlayers() {
        for (Player p: listaIgraca){
            System.out.println(p);
        }
    }
   public void setMaxSize(int maxSize) {
        this.maxSize = maxSize; 
      
    }
   public int size() {
       if(maxSize < listaIgraca.size()) {
           return maxSize;
       } else {
           return listaIgraca.size();
       }
   }
   public int goals() {
       int sum = 0;
       for(Player p: listaIgraca) {
           sum+= p.goals();
       }
       return sum;
   }
}
