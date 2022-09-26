/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.thread2;

/**
 *
 * @author shepherd
 */
public class Main {
    public static void main(String[] args) {
        Thread printer1 = new Thread(new Printer("printer1"));
        Thread printer2 = new Thread(new Printer("printer2"));
        
        printer1.start();
        printer2.start();
        
        System.out.println("Main thread is working....");
    }
    /* Thread printer1  = new Thread(new Runnable()){
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
    */
}
