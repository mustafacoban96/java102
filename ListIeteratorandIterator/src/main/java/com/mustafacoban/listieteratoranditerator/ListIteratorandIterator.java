
package com.mustafacoban.listieteratoranditerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class ListIteratorandIterator {

    public static void main(String[] args) {
        
        //Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("python");
        list.add("C++");
        list.add("Go");
        ListIterator<String> iterator = list.listIterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("********************************");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        
        /*set.add("java");
        set.add("python");
        set.add("C++");
        set.add("Go");
        
        
        
        Iterator iterator1 = set.iterator();
        Iterator iterator2 = list.iterator();
        
        while (iterator1.hasNext()) {
             System.out.println(iterator1.next());
            
        }
        System.out.println("****************************");
        while (iterator2.hasNext()) {
             System.out.println(iterator2.next());
        }*/
    }
}
