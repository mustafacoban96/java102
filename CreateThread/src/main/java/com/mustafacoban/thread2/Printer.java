/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.thread2;

import java.util.jar.Attributes;

/**
 *
 * @author shepherd
 */
public class Printer implements Runnable{
    private String name;

    public Printer(String name) {
        this.name = name;
    }
    
    

    @Override
    public void run() {
        System.out.println(name + " Çalışıyor....");
        
        for(int i = 0 ; i <=10; i++){
            try {
                System.out.println(name + " is writing " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread is interrupted....");
            }
            
        }
        System.out.println(name + " finished the work.");
    }
    
}
