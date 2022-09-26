
package com.mustafacoban.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class FileInputStreamexp {

    public static void main(String[] args) {
        
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("dosya.txt");
            //System.out.println("Read datas : " + (char)(fis.read())); // A char is read
            /*
            fis.skip(12);
            System.out.println("Read datas : " + (char)(fis.read()));*/
            
            int value;
            String s = "";
            while((value = fis.read()) != -1){
                s += (char)value;
            }
            
            System.out.println("Context of the File : " + s);
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist....");
        } catch (IOException ex) {
            Logger.getLogger(FileInputStreamexp.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                
                if (fis != null){
                    fis.close();
                }
            } catch (IOException ex) {
                System.out.println("an error occurs...");
            }
        }
        
        
        
    }
}
