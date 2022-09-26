/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.trywithresource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class TrywithResource {

    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("Dosya.txt")){
            Scanner input = new Scanner(System.in);
            String dil;
            while(true){
                System.out.println("Please enter programming language(s): ");
                dil = input.nextLine();
                
                if(dil.equals("-1")){
                    System.out.println("You exit the program.");
                    System.out.println("Please control the file...");
                    break;
                }
                writer.write(dil + "\n");
            }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TrywithResource.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TrywithResource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
