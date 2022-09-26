/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.prodconsuarrayblockingqueue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class Main {

    public static void main(String[] args) {
       ProducerConsumer pc = new ProducerConsumer();
       
       
       Thread producer = new Thread(new Runnable() {
           @Override
           public void run() {
               pc.produce();
           }
       });
       Thread consumer = new Thread(new Runnable() {
           @Override
           public void run() {
               pc.consume();
           }
       });
       
       producer.start();
       consumer.start();
       
        try {
            producer.join(); 
            consumer.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
}
