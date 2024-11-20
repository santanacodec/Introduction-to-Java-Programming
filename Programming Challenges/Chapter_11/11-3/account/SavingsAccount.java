/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 11.3 (Subclasses of Account) In Programming Exercise 9.7, the Account class 
 * was defined to model a bank account. An account has the properties account number, 
 * balance, annual interest rate, and date created, and methods to deposit and withdraw
 * funds. Create two subclasses for checking and savings accounts. A checking account
 * has an overdraft limit, but a savings account cannot be overdrawn.
 * 
 * Draw the UML diagram for the classes and implement them. Write a test program
 * that creates objects of Account, SavingsAccount, and CheckingAccount and invokes
 * their toString() methods.
 */

package account;

/**
 *
 * @author Edgar Santana
 */
public class SavingsAccount extends Account{
    
    public SavingsAccount(int savingsID, double savingsBalance) {
        super(savingsID, savingsBalance);
    } 
    
    @Override
    public void withdraw(double j) {
        if (j < getBalance()) {
            setBalance(getBalance() - j);
        } else
            System.out.println("ERROR! Account overdrawn");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nYour SavingsAccount cannot be overdrawn";
    }
    
}
