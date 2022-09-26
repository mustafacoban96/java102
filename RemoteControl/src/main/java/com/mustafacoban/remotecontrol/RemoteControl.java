/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.remotecontrol;

import java.util.Iterator;


public class RemoteControl {

    public static void main(String[] args) {
        String[] channel = {"Radyo Viva" , "Radyo fenomen", "Kralpop","Radyo Hacettepe", "Alem FM"};
        
        Remote remote_list = new Remote(channel);
        
        Iterator<String> csayac = remote_list.iterator();
        
        /*for (String s : remote_list){
            System.out.println(s);
        }*/
        
        while(csayac.hasNext()){
            System.out.println(csayac.next());
        }
    }
}
