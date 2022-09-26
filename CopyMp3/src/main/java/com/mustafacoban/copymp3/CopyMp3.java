/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.copymp3;

import com.sun.jdi.Value;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CopyMp3 {
    private static ArrayList<Integer> content = new ArrayList<>();
    
    public static void dosya_oku(){
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("Melike Şahin - Uykumun Boynunu Bükme.mp3");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopyMp3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    int value;
        try {
            while((value  = fis.read()) != -1){
                content.add(value);
            }       } catch (IOException ex) {
            Logger.getLogger(CopyMp3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void dosya_kop(String file_name){
        try {
            FileOutputStream fos = new FileOutputStream(file_name);
            
            for (int deger : content){
                try {
                    fos.write(deger);
                } catch (IOException ex) {
                    Logger.getLogger(CopyMp3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopyMp3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        dosya_oku();
        long baslangic = System.currentTimeMillis();
        dosya_kop("kopya1.mp3");
        dosya_kop("kopya2.mp3");
        dosya_kop("kopya3.mp3");
        dosya_kop("kopya4.mp3");
        long bitis = System.currentTimeMillis();
        System.out.println("Copiyng  took " + ((bitis - baslangic)/1000) + " seconds");
    }
}
