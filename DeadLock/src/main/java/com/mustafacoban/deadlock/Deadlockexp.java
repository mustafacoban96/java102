/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author shepherd
 */
public class Deadlockexp {
    private Account ac1 = new Account();
    private Account ac2 = new Account();
    private Random random = new Random();
    
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
    
    
    
    public void controlLock(Lock a , Lock b){ // elde edilen lock u bırkaıyor
        
        boolean a_lock_elde_edildi = false;
        boolean b_lock_elde_edildi = false;
        // Anahtarlar boşta mı değil mi kontrolü
        while (true) {
            
            a_lock_elde_edildi = a.tryLock();
            b_lock_elde_edildi = b.tryLock();
            
            if(a_lock_elde_edildi == true && b_lock_elde_edildi == true){
                return;
            }
            if(a_lock_elde_edildi == true){
                a.unlock();
            }
            if(b_lock_elde_edildi==true){
                b.unlock();
            }
            
        }
    }
    public void tFunc1(){
        controlLock(lock1, lock2);
        
        
        /*lock1.lock();
        lock2.lock();*/
        for (int i = 0 ; i<5000; i++){
        Account.moneyTransfer(ac1, ac2, random.nextInt(100));
        }
        lock1.unlock();
        lock2.unlock();
    }
    
    public void tFunc2(){
        controlLock(lock2, lock1);
        
        
        /*lock2.lock();
        lock1.lock();*/
        //lock2.lock();
        for (int i = 0 ; i<5000; i++){
        Account.moneyTransfer(ac2, ac1, random.nextInt(100));
        }
        lock2.unlock(); //DeadLOCK ....
        lock1.unlock();
        
        //lock2.unlock();
        
    }
    
    public void threadOver(){
        System.out.println("ac1: " + ac1.getBalance() + " ac2: " + ac2.getBalance());
        System.out.println("Total balance: " + (ac1.getBalance()+ac2.getBalance()));
    }
    
    // to solve deadlock, we use trylock() that is in ReentrantLock
    // trylock() : trylock tries the lock wheter the lock is delivered by any thread.
    //the lock is not delivered by any thread, return true.
}
