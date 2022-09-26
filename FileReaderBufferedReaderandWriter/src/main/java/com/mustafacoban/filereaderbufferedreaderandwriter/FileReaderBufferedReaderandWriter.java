/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.filereaderbufferedreaderandwriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileReaderBufferedReaderandWriter {

    public static void main(String[] args) {
        /*try(//FileReader reader = new FileReader("Dosya.txt")
                //Scanner scanner = new Scanner(new FileReader("Dosya.txt"))
                Scanner scanner = new Scanner (new BufferedReader(new FileReader("Dosya.txt")))){ // we used Scanner To read line by line
        while(scanner.hasNextLine()){
                String infoStudent = scanner.nextLine();
                String[] array = infoStudent.split(",");
                if(array[1].equals(" Yapay Zeka")){
                    System.out.println("Information of student: " + infoStudent);
                }
            }
        }
       catch (FileNotFoundException ex) {
            System.out.println("File is not existed...");
        } catch (IOException ex) {
            System.out.println("While file is opening, an error occurs...");
        }*/
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("Dosya.txt",true))){
            writer.write("Docker\n");
        }
       catch (IOException ex) {
            System.out.println("While file is opening, an error occurs...");
        }
    }
}
