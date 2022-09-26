/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.serialization1;

import java.io.Serializable;

/**
 *
 * @author shepherd
 */
public class Student implements Serializable {
    private static final long serialVersionUID = 12000;
    private String name;
    private int id;
    private String bolum;
    private String course;

    public Student(String name, int id, String bolum) {
        this.name = name;
        this.id = id;
        this.bolum = bolum;
        
    }

    @Override
    public String toString() {
        String info = "Student name: " + name +
                      "\nStudent id: " + id + 
                      "\nStudent Department: " + bolum;
        return info;
    }
    
    
    
}
