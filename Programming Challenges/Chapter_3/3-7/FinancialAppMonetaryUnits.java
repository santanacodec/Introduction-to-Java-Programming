/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 3.7 (Financial application: monetary units) Modify Listing 2.10, ComputeChange.java,
 * to display the nonzero denominations only, using singular words for single units
 * such as 1 dollar and 1 penny, and plural words for more than one unit such as 
 * 2 dollars and 3 pennies.
 */

package financialappmonetaryunits;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class FinancialAppMonetaryUnits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Recieve the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        
        int remainingAmount = (int)(amount * 100);
        
        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        
        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        
        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        
        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        
        // Display results
        System.out.println("Your amount " + amount + " consists of");
        if (numberOfOneDollars >= 2) {
            System.out.println(" " + numberOfOneDollars + " dollars");
        } else if (numberOfOneDollars == 1) {
            System.out.println(" " + numberOfOneDollars + " dollar");
        }
        if (numberOfQuarters >= 2) {
            System.out.println(" " + numberOfQuarters + " quarters ");
        } else if (numberOfQuarters == 1){
            System.out.println(" " + numberOfQuarters + " quarter ");
        }
        if (numberOfDimes >= 2) {
            System.out.println(" " + numberOfDimes + " dimes");
        } else if (numberOfDimes == 1) {
            System.out.println(" " + numberOfDimes + " dime");
        }
        if (numberOfNickels >= 2) {
            System.out.println(" " + numberOfNickels + " nickels");
        } else if (numberOfNickels == 1) {
            System.out.println(" " + numberOfNickels + " nickel");
        }
        if (numberOfPennies >= 2) {
            System.out.println(" " + numberOfPennies + " pennies");
        } else if (numberOfPennies == 1) {
            System.out.println(" " + numberOfPennies + " penny");
        }       
    }    
}
