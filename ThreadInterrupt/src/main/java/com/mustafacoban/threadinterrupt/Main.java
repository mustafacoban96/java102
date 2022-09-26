/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.threadinterrupt;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class Main {

    public static void main(String[] args) {
       
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is working....");
                
                for(int i = 1; i<=10; i++){
                    System.out.println("Thread is writing.....");
                    
                    try {
                        Thread.sleep(1000);
                        System.out.println(i + ". second of sleep");
                        
                    } catch (InterruptedException ex) {
                        
                        System.out.println("Thread's sleep was interrupted.....");
                        System.out.println("************************");
                    }
                    
                }
            }
        });
        
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        t1.interrupt();
        
        
        
        
    }
}
