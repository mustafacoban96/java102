/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.deadlock;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.html.HTML;

/**
 *
 * @author shepherd
 */
public class Main {
    public static void main(String[] args) {
        Deadlockexp dl = new Deadlockexp();
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                dl.tFunc1();
            }
        });
        
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                dl.tFunc2();
            }
        });
        
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        dl.threadOver();
        
        
        
        
        
        
        
    }
    
}
