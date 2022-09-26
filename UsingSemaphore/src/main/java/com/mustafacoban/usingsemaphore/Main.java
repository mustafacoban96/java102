/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.usingsemaphore;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class Main {

    public static void main(String[] args) {
        Semaphorexp ss = new Semaphorexp();
        
        
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ss.threadFuntion(1);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                ss.threadFuntion(2);
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                ss.threadFuntion(3);
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                ss.threadFuntion(4);
            }
        });
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                ss.threadFuntion(5);
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
        
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
