 

package com.mustafacoban.collectionframeworksets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class CollectionFrameworkSets {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new TreeSet<String>();
        Set<String> set3 = new LinkedHashSet<String>();
        
        System.out.println("Hash***********************");
        set1.add("Java");
        set1.add("Python");
        set1.add("Php");
        set1.add("Docker");
        System.out.println("Tree***********************");
        set2.add("Java");
        set2.add("Python");
        set2.add("Php");
        set2.add("Docker");
        System.out.println("Linked***********************");
        set3.add("Java");
        set3.add("Python");
        set3.add("Php");
        set3.add("Docker");
    }
}
