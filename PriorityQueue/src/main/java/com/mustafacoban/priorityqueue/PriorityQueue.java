

package com.mustafacoban.priorityqueue;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

class Player implements Comparable<Player>{
    private String name;
    private Integer id;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    
    

    @Override
    public int compareTo(Player player) {
        if (getId() > player.id ){
            return 1;
        }
        else if (getId() < player.id) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", id=" + id + '}';
    }
    
    
    
    
}
public class PriorityQueue {

    public static void main(String[] args) {
        Queue<Integer> kuyruk = new java.util.PriorityQueue<Integer>();
        
        kuyruk.offer(14);
        kuyruk.offer(10000);
        kuyruk.offer(120);
        kuyruk.offer(1);
        kuyruk.offer(12);
        kuyruk.offer(27);
        
        /*for (int c : kuyruk){ //P.queue does not guarantee the order(priority) at for loop
        System.out.println(c);
        }*/
        
        /*while(!kuyruk.isEmpty()){ // we can see ascending order with while loop in priority queue.
            System.out.println("Eleman çıkartılıyor : " + kuyruk.poll());
            
        }*/
        
        Queue<Player> queue = new java.util.PriorityQueue<Player>();
        queue.offer(new Player("Mustafa" , 2));
        queue.offer(new Player("Musa" , 12));
        queue.offer(new Player("Musolini" , 99));
        queue.offer(new Player("zeliha" , 54));
        queue.offer(new Player("zerrin" , 5582));
        
        Iterator tailor = queue.iterator();
        while(tailor.hasNext()){
            System.out.println(tailor.next());
        }
        System.out.println("*******************************");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll() + "was removed");
            
        }
        
    }
}
