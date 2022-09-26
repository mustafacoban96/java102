/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.reentrantlock;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

    public static void main(String[] args) {
        ReentrantLockexp rr = new ReentrantLockexp();
        
        
        
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                rr.threadFonksiyonu();
                
            }
        });
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                rr.thread2Fonksiyonu();
            }
        });
        
        thread1.start();
        thread2.start();
        
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        rr.threadOver();
        
        
        
        
        
        
        
    }
}
