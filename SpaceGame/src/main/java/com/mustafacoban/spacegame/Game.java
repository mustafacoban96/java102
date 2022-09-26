/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.spacegame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

//10//////////////////////////////////////////
class Ates{
    private int x;
    private int y;

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
//10////////////////////////////////////////////

public class Game extends JPanel implements KeyListener,ActionListener{ //4 //6 KeyListener and ActinListener imple...
    
    //6 İmplenet ettiklerimizle oyunumuza klavye kullanım özelliği getirdik ve topların hareket etme özelliği geldi.
    
    
    //14
    Timer timer = new Timer(1,this); //(delay, action method)
    // Timer üzerinde actionPerformed methodu üzerinde çalışacak.(this)
    
    //14
    
    //7
    private int gecen_sure = 0;
    private int harcanan_ates = 0;
    private BufferedImage resim;
    //7
    
    //8
    //File a image ekledim .
    //8
    
    //9
    private ArrayList<Ates> ates_sayısı = new ArrayList<>();
    //9
    
    //11
    private int atesdirY = 1; // ates sadece y ekseninde hareket eder.
    private int topX = 0; // top x ekseni üzerinde hareket edecek.(hareket hali)
    private int topdirX = 2; // topX değikeinine eklenecek sağa sola gidip gelecek (ekran sınrlarını belilemek için)
    private int UzayGemisiX = 0; // uzay gemiisinin başlangıç noktası
    private int dirUzayX = 20; // tuşa basıldığında kayma miktarı
    //11
    
    
    //19
    public boolean kontrolEt(){
        
        for(Ates ates : ates_sayısı){
            if( new Rectangle(ates.getX(),ates.getY(),10,20).intersects(new Rectangle(topX,0,20,20))){
                return true;
            }
        }
        return false;
    }
    
    //12
    public Game() {
        try {
            //image classı ile png file ını okuyacak
            resim = ImageIO.read(new FileImageInputStream(new File("uzaygemisi.png")));
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setBackground(Color.BLACK);
        //14
        timer.start(); // action metodun işlemesini başlatır.
    }
//13 Override metod component then paint method is choosed
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        gecen_sure +=5;
        
        g.setColor(Color.red);
        
        g.fillOval(topX, 0, 20, 20);
        g.drawImage(resim, UzayGemisiX, 490, resim.getWidth()/10 , resim.getHeight()/10,this); // son parametere image in panel üzerinde oluşmasını sağlar.
        
        //19 ateş çicdrime
        for(Ates ates : ates_sayısı){
            if(ates.getY()<0){
                ates_sayısı.remove(ates);
            }
        }
        g.setColor(Color.blue);
        for(Ates ates : ates_sayısı){
            g.fillRect(ates.getX(), ates.getY(), 10, 20);
        }
        //20
        if(kontrolEt()){
            timer.stop();
            String mesaj = "Kazadınız....\n" + 
                    "Harcanan ateş: " + harcanan_ates +
                    "\nGeçen süre : " + gecen_sure/1000.0 + " saniye";
            JOptionPane.showMessageDialog(this, mesaj);
            System.exit(0);
            
        }
        
    }
    
    @Override
    public void repaint() {
        //paint in tekrardan çalışmasını sağlar.
        super.repaint(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    //13
    
    
    //6////////////////////////
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //16
        int c = e.getKeyCode(); // sağ tık ve sol tık için basıldığında değer dönecek
        if (c == KeyEvent.VK_LEFT){
            if(UzayGemisiX<=0){
                UzayGemisiX = 0;
            }
            else{
                UzayGemisiX -=dirUzayX;
            }
        }
        else if(c == KeyEvent.VK_RIGHT){
            if(UzayGemisiX>=740){
                UzayGemisiX = 740;
            }
            else{
                UzayGemisiX += dirUzayX;
            }
            
        }
        //17
        else if(c == KeyEvent.VK_CONTROL){
            ates_sayısı.add(new Ates(UzayGemisiX+15,490));
            
            harcanan_ates++;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        for (Ates ates : ates_sayısı){
            //18 ateş hareketi
            ates.setY(ates.getY() - atesdirY);
        }
        //15
        topX += topdirX; // top hareket etmeye başlar. sınıra yaklaşınca step=topdirX - li değer alır.
        
        if(topX>=770){
            topdirX = -topdirX;
        }
        if(topX <= 0){
            topdirX = -topdirX;
        }
        
        
        
        repaint(); // methoddaki olayların tekrar etmesini sağlar.
    }
    //6///////////////////////////////////////////////////////////////////////
}
