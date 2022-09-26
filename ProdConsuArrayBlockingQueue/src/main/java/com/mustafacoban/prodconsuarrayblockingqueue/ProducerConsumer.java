/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.prodconsuarrayblockingqueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class ProducerConsumer {
    Random random = new Random();
    
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
    public void produce(){
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                Integer value = random.nextInt(100);
                queue.put(value);
                System.out.println("Porducer product..... " + value);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void consume(){
        
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                Integer value = queue.take();
                System.out.println("Consumer consume..." + value);
                System.out.println("Queue size: " + queue.size());
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    
}
