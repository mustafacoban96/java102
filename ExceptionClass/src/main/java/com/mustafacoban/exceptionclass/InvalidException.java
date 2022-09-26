/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mustafacoban.exceptionclass;

import com.sun.nio.sctp.InvalidStreamException;

/**
 *
 * @author shepherd
 */
public class InvalidException extends ArithmeticException {
    
    public InvalidException(String message){
        super(message);
    }

    @Override
    public void printStackTrace() {
        System.out.println("Entry under the age of 18 prohibited!!!!!");
 }
    
    
}
