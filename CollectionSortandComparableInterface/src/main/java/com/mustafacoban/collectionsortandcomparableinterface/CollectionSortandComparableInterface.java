

package com.mustafacoban.collectionsortandcomparableinterface;

import com.sun.source.tree.Tree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class  Player implements Comparable<Player>{
    private String name;
    private Integer Id;

    public Player (String name, Integer Id) {
        this.name = name;
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
        else if (this.Id > player.Id) {
            return 1;
        }
        return 0;
    }
    
    
}
public class CollectionSortandComparableInterface {

    public static void main(String[] args) {
        /*List <String> list_string = new ArrayList<String>();
        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");
        
        Collections.sort(list_string); // to order alphabetically
        
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
        
        //System.out.println(p2.compareTo(p1));
  
        Collections.sort(list_player); 
        
        for (Player p : list_player){
            System.out.println(p);
        }
    }
}
