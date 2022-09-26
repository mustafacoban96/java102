/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.hashfrekans;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author shepherd
 */
public class HashFrekans {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the sentence: ");
        String cumle = input.nextLine();
        Map<Character,Integer> frekans = new TreeMap<Character,Integer>();
        
        for ( int i = 0; i< cumle.length(); i++){
            char c = cumle.charAt(i);
            
            if(frekans.containsKey(c)){
                frekans.replace(c, frekans.get(c)+1);
            }
            else{
                frekans.put(c,1);
            }
        }
        
        for (Map.Entry<Character,Integer> entry : frekans.entrySet()){
            System.out.println("Character : " + entry.getKey() + " " + entry.getValue() + " was repeated.");
        }
    }
}
