 

package com.mustafacoban.collectionframework;

import java.util.*;



public class CollectionFramework {

    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList();
        LinkedList <Integer> linkedList = new LinkedList();
        CalTime("Linklist",linkedList);
        CalTime("Arraylist",arrayList);
    }
    public static void CalTime(String veri, List<Integer> list){
        long starting;
        long finishing;
        starting = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            list.add(i);
        }
        finishing = System.currentTimeMillis();
        System.out.println(veri +" ekleme suresi: " + (finishing-starting) + "ms");
    }
}
