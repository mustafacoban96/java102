/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.serialization1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class ReadObjects {
    
    public static void main(String[] args) {
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("ogrenci.bin"))) {
            
            Student ogrenci1 = (Student)in.readObject();
            Student ogrenci2 = (Student)in.readObject();
            System.out.println("****************************************");
            System.out.println(ogrenci1);
            System.out.println("****************************************");
            System.out.println(ogrenci2);
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist...");
        } catch (IOException ex) {
            System.out.println("While opening, an error occured.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class was not found.");
        }
    }
    
}
