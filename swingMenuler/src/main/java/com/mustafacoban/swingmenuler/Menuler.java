/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mustafacoban.swingmenuler;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

/**
 *
 * @author shepherd
 */
public class Menuler extends javax.swing.JFrame {

    /**
     * Creates new form Menuler
     */
    public Menuler() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        yazi_alani = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        dosya = new javax.swing.JMenu();
        DosyaAc = new javax.swing.JMenuItem();
        DosyaKaydet = new javax.swing.JMenuItem();
        Cıkıs = new javax.swing.JMenuItem();
        duzenle = new javax.swing.JMenu();
        renk = new javax.swing.JMenu();
        renkDegistir = new javax.swing.JMenuItem();
        yaziTipi = new javax.swing.JMenu();
        Arial = new javax.swing.JMenuItem();
        timeNewRoman = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        yazi_alani.setColumns(20);
        yazi_alani.setRows(5);
        jScrollPane1.setViewportView(yazi_alani);

        dosya.setText("Dosya");

        DosyaAc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        DosyaAc.setText("Dosya Aç");
        DosyaAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosyaAcActionPerformed(evt);
            }
        });
        dosya.add(DosyaAc);

        DosyaKaydet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        DosyaKaydet.setText("Dosya Kaydet");
        DosyaKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosyaKaydetActionPerformed(evt);
            }
        });
        dosya.add(DosyaKaydet);

        Cıkıs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Cıkıs.setText("Çıkış");
        Cıkıs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CıkısActionPerformed(evt);
            }
        });
        dosya.add(Cıkıs);

        jMenuBar1.add(dosya);

        duzenle.setText("Düzenle");

        renk.setText("Renk");

        renkDegistir.setText("Renk Değiştir");
        renkDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renkDegistirActionPerformed(evt);
            }
        });
        renk.add(renkDegistir);

        duzenle.add(renk);

        yaziTipi.setText("Yazı Tipi");

        Arial.setText("Arial");
        Arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArialActionPerformed(evt);
            }
        });
        yaziTipi.add(Arial);

        timeNewRoman.setText("Times New Roman");
        timeNewRoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeNewRomanActionPerformed(evt);
            }
        });
        yaziTipi.add(timeNewRoman);

        duzenle.add(yaziTipi);

        jMenuBar1.add(duzenle);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CıkısActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CıkısActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CıkısActionPerformed

    private void DosyaAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosyaAcActionPerformed
        JFileChooser fc = new JFileChooser();
        
        int i = fc.showOpenDialog(this);
        
        if(i == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            
            try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){
                String icerik= "";
                while(scanner.hasNextLine()){
                    icerik += scanner.nextLine() + "\n";
                }
                yazi_alani.setText(icerik);
            }   
            catch (FileNotFoundException ex) {
                Logger.getLogger(Menuler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }//GEN-LAST:event_DosyaAcActionPerformed

    private void DosyaKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosyaKaydetActionPerformed
       JFileChooser secmek = new JFileChooser();
       
       int answer = secmek.showSaveDialog(this);
       // ok a mı basıldı yoksa cancel e mi doğrulaması yapmak için .... if
       if(answer == JFileChooser.APPROVE_OPTION){
           String dosya_yolu = secmek.getSelectedFile().getPath();
           
           try(FileWriter writer = new FileWriter(dosya_yolu)){
               writer.write(yazi_alani.getText());
               
           } catch (IOException ex) {
               Logger.getLogger(Menuler.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_DosyaKaydetActionPerformed

    private void renkDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renkDegistirActionPerformed
       Color renk = JColorChooser.showDialog(this, "Bir renk seçiniz", Color.RED);
       
       yazi_alani.setForeground(renk);
    }//GEN-LAST:event_renkDegistirActionPerformed

    private void ArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArialActionPerformed
        Font font = new Font("Arial",Font.PLAIN,20); 
        yazi_alani.setFont(font);
    }//GEN-LAST:event_ArialActionPerformed

    private void timeNewRomanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeNewRomanActionPerformed
        Font font = new Font("Times New Roman",Font.PLAIN,20);
        yazi_alani.setFont(font);
    }//GEN-LAST:event_timeNewRomanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Arial;
    private javax.swing.JMenuItem Cıkıs;
    private javax.swing.JMenuItem DosyaAc;
    private javax.swing.JMenuItem DosyaKaydet;
    private javax.swing.JMenu dosya;
    private javax.swing.JMenu duzenle;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu renk;
    private javax.swing.JMenuItem renkDegistir;
    private javax.swing.JMenuItem timeNewRoman;
    private javax.swing.JMenu yaziTipi;
    private javax.swing.JTextArea yazi_alani;
    // End of variables declaration//GEN-END:variables
}