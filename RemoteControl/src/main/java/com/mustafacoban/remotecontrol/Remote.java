/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.remotecontrol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shepherd
 */
public class Remote implements Iterable<String>,Iterator<String>{
    private List<String> channels_list = new ArrayList<String>();
    private int index = 0;
    
    public Remote(String[] channels){
        
        for (String s : channels){
            channels_list.add(s);
        }
    }

    @Override
    public Iterator<String> iterator() { //Iterable 
        return channels_list.iterator();
    }

    @Override
    public boolean hasNext() { //Iterator
        if (index < channels_list.size()){
            return true;
        }
        else{
        return false;
        }
 }

    @Override
    public String next() { //Iterator
        String channel = channels_list.get(index);
        index++;
        return channel;
    }
    
    public void kanal_kaldır(String channel){
        channels_list.remove(channel);
    }
    public void kanal_ekle(String channel){
        channels_list.add(channel);
    }
}

