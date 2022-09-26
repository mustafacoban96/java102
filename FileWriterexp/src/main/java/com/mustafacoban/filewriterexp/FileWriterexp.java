/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.filewriterexp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class FileWriterexp {

    public static void main(String[] args) {
        FileWriter writer = null;
        
        try {
            writer = new FileWriter("file.txt",true);
            writer.write("Mustafa Coban");
            writer.write("\nEmir Coban");
            writer.write("\nEbru Coban");
        } catch (IOException ex) {
            System.out.println("While File was opening, IOException occured...");
        }finally{
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("While File was closing, IOException occured...");
                }
            }
        }
    }
}
