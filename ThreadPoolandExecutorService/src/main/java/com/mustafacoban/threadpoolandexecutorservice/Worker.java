/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.threadpoolandexecutorservice;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shepherd
 */
public class Worker implements Runnable{ // class was thread anymore
    private String name;
    private int taskId;

    public Worker(String name, int taskId) {
        this.name = name;
        this.taskId = taskId;
    }
    
     
    @Override
    public void run() {
        System.out.println("Worker " + name + " " + taskId + ". started the job. ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Worker " + name + " " + taskId + ". finished the job. ");
    }

    
}
