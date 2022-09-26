/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.serialization1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class Serialization1 { // WriteObject

    public static void main(String[] args) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin")) {}){
            Student ogrenci1 = new Student("Mustafa Coban", 355, "Compter Science");
            Student ogrenci2 = new Student("Emir Coban", 12, "Motor Teknolojileri");
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);
            
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist...");
        } catch (IOException ex) {
            System.out.println("While opening, an error occured.");
        }
    }
}
