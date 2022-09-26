/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class FileOutputStreamexo {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        
        try {
            fos = new FileOutputStream("dosya.txt",true);
            //fos.write(68); // ASCII character numbers
            //fos.write(74);
            //fos.write(52);
            // varolan file'a veri eklemek için FileOutputStream true yazarız içerik silinmesin diye...
            
            //byte[] array ={77, 76, 102, 89, 77,77};
            
            String s = "\nMustafa Coban";
            byte[] array = s.getBytes(); // getBytes() ==> String ===> Byte
            fos.write(array);
        } 
        
        
        
        
        catch (FileNotFoundException ex) {
            System.out.println("File is not found!!!!");
        } catch (IOException ex) {
            System.out.println("while File is written, an error is encountered");
        }
        finally{
            try {
                fos.close();
            } catch (IOException ex) {
                System.out.println("While Closing , an error occurs");
            }
        }
        
    }
}
