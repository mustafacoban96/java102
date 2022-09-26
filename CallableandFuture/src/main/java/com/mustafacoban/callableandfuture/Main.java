/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.callableandfuture;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class Main {

    public static void main(String[] args) {
        try {
            ExecutorService executor = Executors.newFixedThreadPool(1);
            
            /*executor.submit(new Runnable() {
            @Override
            public void run() {
            Random random = new Random();
            
            System.out.println("Thread çalışıyor......");
            int sure = random.nextInt(1000) + 2000;
            try {
            Thread.sleep(sure);
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Thread is exiting");
            }
            });*/
            
            
            Future<?> future = executor.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    Random random = new Random();
                    
                    System.out.println("Thread çalışıyor......");
                    int sure = random.nextInt(1000) + 2000;
                    if(sure > 2500){
                        throw new IOException("Thread slept too much.");
                    }
                    try {
                        Thread.sleep(sure);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Thread is exiting");
                    return sure;
                }
            });
            
            
            executor.shutdown();
            System.out.println("The value: " + future.get());
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            ex.printStackTrace();
        }
    }
}
