/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.spacegame;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author shepherd
 */
public class GameScreen extends JFrame  { //1
    
    

    public GameScreen(String title) throws HeadlessException { //2 Constructer
        super(title);
    }

    public static void main(String[] args) {
        //3
        GameScreen ekran = new GameScreen("Uzay Oyunu");
        
        ekran.setResizable(false);
        ekran.setFocusable(false);
        
        ekran.setSize(800,600);
        // The setDefaultCloseOperation() method is used to specify one of several options for the close button.
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        //3
        //5
        Game oyun = new Game();
        
        oyun.requestFocus(); // inputları alır 
        oyun.addKeyListener(oyun); // klavyeyi anlar
        oyun.setFocusable(true); // odağı frameden çekp panele verdik.
        oyun.setFocusTraversalKeysEnabled(false); // klavye işlemlerini jpanel için anlar.
        
        
        ekran.add(oyun);// JPaneli JFrame e ekledik.
        
        
        ekran.setVisible(true);
        //5
        
        
        
        
        
        
        
        
        
        
        
    }
}
