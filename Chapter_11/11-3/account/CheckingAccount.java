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
public class CheckingAccount extends Account{
    double overdraftLimit = -200;
    public CheckingAccount(int checkingID, double checkingBalance) {
        super(checkingID, checkingBalance);
    }
    
    @Override
    public void withdraw(double j) {
        if (getBalance() - j > overdraftLimit) {
            setBalance(getBalance() - j);
        } else
            System.out.println("ERROR! You are going over the overdtaft limit!");
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nThe overdraft limit for your checking account is -$200";
    }
}
