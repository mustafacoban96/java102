/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.throwkeyword;

import java.util.Scanner;


public class ThrowKeyWord {
    public static void ControlAge(int age){
        if (age<18){
            throw new ArithmeticException();
        }
        else{
            System.out.println("Welcome to the pub");
        }
        
    }
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age: ");
        age = input.nextInt();
        
        try{
            ControlAge(age);
        }
        catch(ArithmeticException a){
            System.out.println("person that is only over 18 can come in the pub ");
        }
    }
}
