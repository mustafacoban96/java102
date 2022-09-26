

package com.mustafacoban.queueandlinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class QueueandLinkedList {

    public static void main(String[] args) {
        Queue <String> queue = new LinkedList<String>();
        
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("Php");
        queue.offer("C++");
        
        //System.out.println(queue.peek()); // it shows element that is added first of queue. 
        queue.poll();
        Iterator <String> co = queue.iterator();
        //queue.poll(); 
        //If the queue is modified after the iterator is created except through the iterator’s own remove method,
        //then both iterator and enhanced for-loop will throw a ConcurrentModificationException
        while(co.hasNext()){
            System.out.println(co.next());
        }
        
    }
}
