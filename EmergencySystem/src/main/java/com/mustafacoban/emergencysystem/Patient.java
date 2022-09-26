/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.emergencysystem;

/**
 *
 * @author shepherd
 */
public class Patient implements Comparable<Patient>{
    
    private String disease;
    private String pname;
    private int priority;

    public Patient( String pname,String disease) {
        this.disease = disease;
        this.pname = pname;
        
        if(disease.equals("Appendicitis")){
            this.priority = 3;
        }
        else if (disease.equals("Headache")){
            this.priority = 1;
        }
        else{
            this.priority = 2;
        }
        
    }

    @Override
    public int compareTo(Patient patient) {
        if (this.priority > patient.priority){ // patient passes current priority. 
            return -1;
        }
        else if (this.priority < patient.priority){
            return 1;
        }
        else{
            return 0; 
        }
        
    }

    @Override
    public String toString() {
        String info = "Patient's name: " + pname
                +"\n Disease : " + disease
                +"\n Priority: " + priority;
        return info;
        }
    
    
}
