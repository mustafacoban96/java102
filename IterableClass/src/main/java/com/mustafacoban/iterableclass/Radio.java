/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.iterableclass;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author shepherd
 */
public class Radio implements Iterable<String>,Iterator<String>{
    
    private ArrayList<String> channel_list = new ArrayList<String>();
    private int index = 0;

    @Override
    public boolean hasNext() {
        if(index < channel_list.size()){
            return true;
        }
        else{
            return false;
        }
}

    @Override
    public String next() {
        String value = channel_list.get(index);
        index++;
        return value;
    }
    
    public Radio(String[] channels){
        
        for(String s : channels){
            channel_list.add(s);
        }
    }

    @Override
    public Iterator<String> iterator() {
        return channel_list.iterator();
}
    
}
