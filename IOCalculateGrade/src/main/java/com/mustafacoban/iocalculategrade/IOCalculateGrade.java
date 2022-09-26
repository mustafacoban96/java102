/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.iocalculategrade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IOCalculateGrade {
    public static void read_grade(String file){
        String[] array=null;
    try(Reader robot = new BufferedReader(new FileReader(file));
            Writer writer = new BufferedWriter(new FileWriter("grade_average.txt", true))
        ){
        Scanner scanner = new Scanner(robot);
        float avg;
        int number = 1;
        while(scanner.hasNext()){
            array = scanner.nextLine().split(",");
            avg = (float) ((Integer.parseInt(array[1]) + Integer.parseInt(array[2]) + Integer.parseInt(array[3]))/3.0);
            writer.write( number +"." + array[0] + " ====> " + String.format("%.02f",avg) + "\n");
            number++;
                    
                }
            } catch (IOException ex) {
            Logger.getLogger(IOCalculateGrade.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        /*} catch (FileNotFoundException ex) {
            System.out.println("The file does not exist in tihs directory.");
        } catch (IOException ex) {
            System.out.println("While file was opening,An error occured");
        }*/
        
    }
    /*public static void  write_grade(){
        
        try(Writer writer = new BufferedWriter(array, true)){
            Scanner scanner = new Scanner();
            
        } catch (IOException ex) {
            Logger.getLogger(IOCalculateGrade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    public static void main(String[] args) {
        read_grade("dosya.txt");
    }
}
