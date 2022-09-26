/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.hashcodeequal;

import java.util.HashSet;
import java.util.Set;

class Player {
    private String name;
    private int id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", id=" + id + '}';
    }
    
    
}
public class HashCodeEqual {

    public static void main(String[] args) {
        Set<Player> hashset = new HashSet<Player>();
        
        Player player1 = new Player("Mustafa", 0);
        Player player2 = new Player("Musa", 1);
        Player player3 = new Player("Yusuf", 3);
        Player player4 = new Player("Mustafa", 0);
        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);
        
        for (Player p : hashset){
            System.out.println(p);
        }
        
        
    }
}
