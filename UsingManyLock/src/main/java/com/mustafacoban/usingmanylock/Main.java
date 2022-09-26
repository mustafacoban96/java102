/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.usingmanylock;

import com.mustafacoban.usingmanylock.ListWorker;

/**
 *
 * @author shepherd
 */
public class Main {
    public static void main(String[] args) {
        // methodlara synchronized eklenirse o class içerindeki methodlarda sadece 1 thread çalışır.
        // 1 anahtar olduğu için diğer thread bekler.
        // bunu çözmek için 2 anahtar gerekir.
        // synchronized block oluşturmamız gerekir.
        ListWorker worker = new ListWorker();
        
        
        worker.calistir();
        
        
        
    }
}
