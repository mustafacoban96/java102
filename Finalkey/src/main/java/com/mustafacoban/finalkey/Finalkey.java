
package com.mustafacoban.finalkey;


public class Finalkey {
    public final int obje_sayisi;
    private static int say = 0; // I change the private to public key for object f3
    private final String isim;
    
    public Finalkey(String isim){
        this.isim = isim;
        say++;
        obje_sayisi = say;
    }
    
}
