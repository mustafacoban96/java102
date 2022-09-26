/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.collectionsortandcomparatorinterface;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class BigToSmall implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
class SmallToBig implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
       if (o1.getId() < o2.getId()){
            return -1;
        }
        else if (o1.getId() > o2.getId()) {
            return 1;
        }
        return 0;
    }
    
}
    class  Player implements Comparable<Player>{

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
    private Integer Id;

    public Player (String name, Integer Id) {
        this.name = name;
        this.Id = Id;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "|||| ID: " + Id + " İsim " + name +  " |||| ";
    }

    @Override
    public int compareTo(Player player) {
        if (this.Id < player.Id){
            return -1;
        }
        else if (this.Id > player.Id) { /// this(şuanki obje) vs (parametre)gönderilecek obje
            return 1;
        }
        return 0;
        }
    }
public class CollectionSortandComparatorInterface {

    public static void main(String[] args) {
        
        /*List <String> list_string = new ArrayList<String>();
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
        
        Collections.sort(list_string,new BigToSmall()); // to order alphabetically
        
        for( String s : list_string){
            System.out.println(s);
        }*/
        List <Player> list_player = new ArrayList<Player>();
        
        list_player.add(new Player("Murat", 5));
        list_player.add(new Player("Mustafa", 1));
        list_player.add(new Player("Emre", 10));
        list_player.add(new Player("Faruk", 4));
        
        Player p1 = new Player("Mustafa", 1);
        Player p2 = new Player("Emre", 10);
        
        Collections.sort(list_player, new SmallToBig());
        for( Player p : list_player){
            System.out.println(p);
        }
    }
}
