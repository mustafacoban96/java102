/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.grafikkullanimi;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author shepherd
 */
public class GrafikKullanimi extends JPanel{

    public GrafikKullanimi() {
        setBackground(Color.black);
    } 

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        g.setColor(Color.red);
        g.drawRect(200, 200, 80, 60);
        
        
    }
    
}
