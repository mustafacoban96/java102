/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.iterableclass;

import java.util.Iterator;

/**
 *
 * @author shepherd
 */
public class IterableClass {

    public static void main(String[] args) {
        String[] channel = {"Radyo Viva" , "Radyo fenomen", "Kralpop","Radyo Hacettepe", "Alem FM"};
        
        Radio radyo = new Radio(channel);
        
        /*for(String s : radyo){     // for each works to convert iterator for object...
            System.out.println(s);
        }*/
        
        Iterator<String> iterator = radyo.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
    }
}
