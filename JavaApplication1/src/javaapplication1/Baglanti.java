/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author shepherd
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



/**
 *
 * @author shepherd
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;







/**
 *
 * @author shepherd
 */
public class Baglanti {
    private String kullanici_adi = "root";
    private String parola = "";
    
    private String db_ismi = "demo";
    private String host = "localhost";
    
    private int port = 3306;
    
    private Connection con = null;
    
    
    
    
    public Baglanti(){
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        }
        catch(ClassNotFoundException ex){
            System.out.println("Driver Bulunamadı.");
        }
        
        try {
            con = DriverManager.getConnection(url,kullanici_adi,parola);
            System.out.println("Bağlantı başarılı");
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız");
        }
        
  
    }
    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
    }
}

