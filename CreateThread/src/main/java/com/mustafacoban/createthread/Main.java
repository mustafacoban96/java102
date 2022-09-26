/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.createthread;

/**
 *
 * @author shepherd
 */
public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer("printer1");
        Printer printer2 = new Printer("printer2");
        
        printer1.start();
        printer2.start();
        
        System.out.println("Main thread is working.");
    }
}
