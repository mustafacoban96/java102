/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.usingmanylock;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ListWorker {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    //ArrayList<Integer> list3 = new ArrayList<>();
    // two locks were created
    // lock can be created as any datatype
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    Random random = new Random();
    public void list1Add(){ // bu metoda sadece 1 thread girsin demiş olduk with synchronized public synchronized void list1Add
        synchronized (lock1) {
            
        
        try {
            Thread.sleep(1);
            list1.add(random.nextInt(100));
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void list2Add(){ // iki methoda 1 thread girecek...public synchronized void list2Add
     synchronized (lock2) {
        try {
            Thread.sleep(1);
            list2.add(random.nextInt(100));
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    }
    
    
    /*public synchronized void list3Add(){
        try {
            Thread.sleep(1);
            list3.add(random.nextInt(100));
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
    public void valueAssign(){
        //list1Add();
        //list2Add();
        for(int i = 0 ; i<1000 ; i++){
            list1Add();
            list2Add();
        }
        
        
    }
    
    public void calistir(){
        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                valueAssign();
            }
            
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                valueAssign();
            }
        });
        long bas = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("List 1 size: " + list1.size() + " List 2 size: " + list2.size());
        long bitis = System.currentTimeMillis();
        System.out.println("The time interval: " + (bitis-bas));
    }
    
}
/* https://www.softwaretestinghelp.com/what-is-thread-synchronization-in-java/*/