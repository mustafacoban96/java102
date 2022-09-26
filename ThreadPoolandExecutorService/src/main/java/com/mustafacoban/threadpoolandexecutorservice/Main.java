/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.threadpoolandexecutorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class Main {
    public static void main(String[] args) {
        
        ExecutorService executor = Executors.newFixedThreadPool(5); //Threadpool was created 
        
        for (int i = 1; i <=5 ; i++){
            executor.submit(new Worker(String.valueOf(i), i)); // Worker is runnable class so it is thread class.
        }
        // executor specify what time threads will work
        // executor deliver missions to threads
        executor.shutdown();
        System.out.println("All f jobs are delivered...");
        try {
            //Before work is done , executor won't close
            executor.awaitTermination(1, TimeUnit.DAYS); // execuotr wait a day
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("All of works were completed.");
            
            
            
            /*Thread t1 = new Thread(new Worker("1", 1));
            Thread t2 = new Thread(new Worker("2", 2));
            Thread t3 = new Thread(new Worker("3", 3));
            Thread t4 = new Thread(new Worker("4", 4));
            Thread t5 = new Thread(new Worker("5", 5));
            System.out.println("Whole works were delivered.");
            t1.start();
            t2.start();
            
            
            try {
            t1.join();
            t2.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            t3.start();
            t4.start();
            try {
            t3.join();
            t4.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            t5.start();
            try {
            t5.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Whole works were done.");*/
        
        
    }
    
}
