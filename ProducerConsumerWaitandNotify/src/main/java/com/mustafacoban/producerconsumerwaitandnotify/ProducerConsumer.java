/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.producerconsumerwaitandnotify;

import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class ProducerConsumer {
    
    Random random = new Random();
    Object lock = new Object();
    LinkedList<Integer> queue = new LinkedList<Integer>();
    private int bound = 10;
    
    
    
    public void produce(){
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            synchronized (lock) {
                if(queue.size() == bound){
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Integer value = random.nextInt(100);
                queue.offer(value);
                System.out.println("Producer product number: " + value);
                lock.notify();
            }
            
        }
    }
    
    public void consume(){
        while (true) {            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            synchronized (lock) {
                if(queue.size() == 0){
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Integer value = queue.poll();
                System.out.println("Consumer consume the number: " + value);
                System.out.println("Queue Size: " + queue.size());
                lock.notify();
                
            }
        }
    }
    
}
