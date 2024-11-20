/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Edgar Santana
 */
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000.0);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000);
        System.out.println(account.toString());
        System.out.println("\nAccount Created on: " + java.time.LocalDate.now());
        
        SavingsAccount savingsAccount = new SavingsAccount(2211, 10000.0);
        savingsAccount.setAnnualInterestRate(4.5);
        savingsAccount.withdraw(2500.0);
        account.deposit(3000);
        System.out.println(savingsAccount.toString());
        System.out.println("\nAccount Created on: " + java.time.LocalDate.now());
        
        CheckingAccount checkingAccount = new CheckingAccount(3322, 20000.0);
        checkingAccount.setAnnualInterestRate(4.5);
        checkingAccount.withdraw(2500.0);
        checkingAccount.deposit(3000);
        System.out.println(checkingAccount.toString());
        System.out.println("\nAccount Created on: " + java.time.LocalDate.now());       
                
    }
    
}
