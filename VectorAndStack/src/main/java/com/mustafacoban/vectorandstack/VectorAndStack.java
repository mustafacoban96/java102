/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.vectorandstack;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author shepherd
 */
public class VectorAndStack {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        
        vector.add("Java");
        vector.add("Python");
        vector.add("Php");
        vector.add("Python");
        
        /*for (String s : vector){
            System.out.println(s);
        }*/
        
        /*ListIterator<String> iterator = vector.listIterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        
        /*Enumeration<String> enumeration = vector.elements();
        
        while (enumeration.hasMoreElements()) {
            String nextElement = enumeration.nextElement();
            System.out.println(nextElement);
        }*/
        
        Stack<String> stack = new Stack<String>();
        
        stack.push("Python");
        stack.push("Java");
        stack.push("Php");
        stack.push("C");
        
        /*Enumeration<String> enumeration = stack.elements();
        
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }*/
        System.out.println(stack.peek()); // take top(last) element of the stack
        // pop() remoıes top of the stack ****LIFO***last in - first out
        
    }
}
