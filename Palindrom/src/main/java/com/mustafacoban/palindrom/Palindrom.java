/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.palindrom;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shepherd
 */
public class Palindrom {

    public static void main(String[] args) {
        Stack<Character> word = new Stack<Character>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String kelime = input.nextLine();
        
        for ( int i = 0 ; i< kelime.length()/2 ; i++){
            word.push(kelime.charAt(i));
        }
        if (isPalindrom(kelime, word)){
            System.out.println("The word is palindrom");
        }else{
            System.out.println("It is not palindrom....");
        }
    
    }  
    public static boolean isPalindrom(String kelime, Stack<Character> word){
        for (int i = (kelime.length()/2)+1 ; i < kelime.length() ; i++){
            
            if(kelime.charAt(i)!= word.pop()){
               return false;
           }
        }
        return true;
    }
}
