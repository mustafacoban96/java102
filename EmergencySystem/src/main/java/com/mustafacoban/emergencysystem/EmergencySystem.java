/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.emergencysystem;

import java.util.PriorityQueue;
import java.util.Queue;


public class EmergencySystem {

    public static void main(String[] args) {
        Queue<Patient> ordering = new PriorityQueue<Patient>();
        
        ordering.offer(new Patient("Mustafa","Burn"));
        ordering.offer(new Patient("Lale" ,"Appendicitis"));
        ordering.offer(new Patient("Elisa","Appendicitis"));
        ordering.offer(new Patient("Muhtar","Burn"));
        ordering.offer(new Patient("Musa","Headache"));
        ordering.offer(new Patient("Ömer","Appendicitis"));
        ordering.offer(new Patient("Emir","Headache"));
        
        int i = 1;
        while(!ordering.isEmpty()){
            System.out.println("*********************************");
            System.out.println(i + ".patient");
            System.out.println(ordering.poll());
            System.out.println("*********************************");
            i++;
        }
    }
}
