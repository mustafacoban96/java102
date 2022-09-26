/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.reentrantlock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class ReentrantLockexp {
    private int say = 0;
    private Lock lock = new ReentrantLock();
    private Condition kosul = lock.newCondition();// to apply like Notify and wait confition class is used for the lock.
    
    
    public void artır(){
        for(int i = 0; i<10000; i++){
            say++;
        }
    }
    
    public void threadFonksiyonu(){
        lock.lock(); // the func take the key so the key can't be taken by other func.
        // Any thread can not enter the func.
        
        System.out.println("Thread1 is working.....");
        System.out.println("Thread1 wait for is waken up...");
        try {
            kosul.await(); // thread1 is sleeping
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockexp.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread1 is waken up.....");
        artır();
        lock.unlock();
        // the key is free anymore, so other threads can enter the func.
    }
    
    public void thread2Fonksiyonu(){
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockexp.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner scanner = new Scanner(System.in);
        lock.lock();
        System.out.println("Thread2 is working.....");
        artır();
        System.out.print("To continue press a key: ");
        scanner.nextLine();
        kosul.signal(); // thread2 sends signal for thread1's work.
        System.out.println("wakeeee uup (thread1)");
        lock.unlock();
        
        
        
        
        
        /*lock.lock();
        try{
            artır();
        }
        finally{
            lock.unlock();
        }*/
        
    }
    // programımız herhangi expception karşınsında sonsuza kadar kilitlnebilir
    // bu yüzden anahtarın her durumda teslim edilebilmesi için try finally block u kullanılır. 
    public void threadOver(){
        System.out.println("Counter ==> " + say);
    }
}
