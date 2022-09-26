package com.mustafacoban.packet1;

import com.mustafacoban.packet2.Animal;

public class Horse extends Animal{

    public Horse(String name) {
        super(name);
    }
    
    public void isim(){
        System.out.println(super.name);
    }
   
}
