/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shepherd
 */
public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(10,"java");
        hashMap.put(20, "Python");
        hashMap.put(40, "C++");
        //System.out.println(hashMap);
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("Keys: " + entry.getKey());
        }
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("Keys: " + entry.getValue());
        }
    }
    
}
