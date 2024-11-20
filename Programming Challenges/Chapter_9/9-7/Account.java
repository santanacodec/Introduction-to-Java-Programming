/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 9.7 (The Account class) Design a class named Account that contains:
 * - a private int data field named id for the account (default 0).
 * - a private double data field named balance for the account (default 0).
 * - a private double data field named annualInterestRate that stores the current 
 *   interest rate (default 0). Assume that all acounts have the same interest rate.
 * - a private Date data field named dateCreated that stores the date when the account 
 *   was created.
 * - a no-arg constructor that creates a default account.
 * - a constructor that creates an account with the specified id and initial balance.
 * - the accessor and mutator methods for id, balance, and annualInterestRate.
 * - the accessor method for dateCreated.
 * - A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * - a method named getMonthlyInterest() that returns the monthly interest.
 * - a method named withdraw that withdraws a specified amount from the account.
 * - a method named deposit that deposits a specified amount to the account.
 * Draw the UML diagram for the class then implement the class. (Hint: the method 
 * getMonthlyInterest() is to return the monthly interest, not the interest rate.
 * Monthly interest is balance * monthlyInterestRate. monthlyInterestRate is 
 * annualInterestRate / 12. Note annnualInterestRate is a percentage, for example 4.5%.
 * You need to divide it by 100.)
 * Write a test program that creates an Account object with an account ID of 1122, a 
 * balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw method 
 * to withdraw $2,500, use the deposit method to deposit $3,000, and print the balance,
 * the monthly interest, and the date when this account was created.
 */
package account;

import java.util.Date;

/**
 *
 * @author Edgar Santana
 */
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account account = new Account(1122, 20000.0);
        account.setAnnualInterestRate(4.5);
        System.out.println("Account ID: " + account.getId() + 
                "\nAccount Balance: " + account.getBalance() + 
                "\nMonthly Interest: " + account.getMonthlyInterest() + 
                "\nWithdraw Ammount: 2500" + 
                "\nAccount Balance after Withdrawal: " +account.withdraw(2500.0) + 
                "\nDeposit Amount: 3000" +
                "\nAccount Balance after Deposit: " + account.deposit(3000) + 
                "\nAccount Created on: " + java.time.LocalDate.now());
    }
    
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account() {  
    }
    
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public int getId() {
        return id;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }
    
    public double getMonthlyInterestRate() {       
        return (annualInterestRate / 100) / 12;
    }
    
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    
    public double withdraw(double j) {
        return balance - j;
    }
    
    public double deposit(double j) {
        return balance + j;
    }
}
