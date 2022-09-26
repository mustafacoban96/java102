/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.waitvenotify;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WaitNotify {
    private Object lock = new Object();
    
    public void thread1Func(){
        //synchronized (this) { // this line provide a lock to thread.
        // if we use this keyword , other method's block can be block due to synchronized key word
        // So we definite a lock for blocks that we specified. 
        synchronized (lock){
            System.out.println("Thread1 is working....");
            System.out.println("Thread1 is waiting for Thread2 notfiy to own");
            
            try {
                //wait(); // at this point thread1 deliver the lock then it waits for notified by other thread.
                lock.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Thread1 wake up and it continue");
            
        }
    }
    
    public void thread2Func(){
        Scanner input = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
        }
        //synchronized (this) {
        synchronized (lock){
            System.out.println("Thread2 is working");
            System.out.println("press a key To continue");
            input.nextLine();
            
            lock.notify();
            System.out.println("Thread1 is waken up by thread2");
            
        }
        
        
        
        
        
        
        
    }
}


