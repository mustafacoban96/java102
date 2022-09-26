/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.usingsemaphore;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class Semaphorexp {
    private Semaphore sem = new Semaphore(3); // a block is worked by 3 threads at the same time.
    
    public void threadFuntion(int id){
        
        try {
            sem.acquire(); // thread blokclara girişinde semphore değerini 1 azaltıyor 0 olana kadar.
            // 0 olunca kod bloğunu kilitliyor.
        } catch (InterruptedException ex) {
            Logger.getLogger(Semaphorexp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Thread is starting ...ID: " + id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Semaphorexp.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread is exiting....." + id);
        sem.release();; // semaphore değerini 1 artırır ve diğer threadlerin girmesine izin verir.
    }
    
}
