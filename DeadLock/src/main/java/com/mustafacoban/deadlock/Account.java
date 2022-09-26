/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mustafacoban.deadlock;


public class Account {

    private int balance = 10000;
    
    
    
    public void withdraw(int amount){
        balance +=amount;
    }
    
    public void deposit(int amount){
        balance -=amount;
    }
    
    
    public static void moneyTransfer(Account account1, Account account2, int among){
        account1.deposit(among);
        account2.withdraw(among);
        
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
