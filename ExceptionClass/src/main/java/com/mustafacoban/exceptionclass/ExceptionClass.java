/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.exceptionclass;

import java.util.Scanner;


public class ExceptionClass {
    public static void AgeCon(int age){ // if we extends checked exception(IOexpception e.g.) to InvalidExc.. , we should use
        // throws key word for this function ====> exp_func() throws InvalidException....
        if (age < 18 ){
            throw new InvalidException("Invalid age!!!");
        }
        else{
            System.out.println("Welcome to the pub dudes...");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the age: ");
        int age = input.nextInt();
        
        try{
            AgeCon(age);
        }
        catch (InvalidException y){
            //y.printStackTrace();
            System.out.println(y);
        }
         
    }
}
