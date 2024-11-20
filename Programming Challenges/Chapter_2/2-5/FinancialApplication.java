/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 2.5 (Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate and then computes the gratuity and total. For example, 
 * if the users enter 10 for subtotal and 12% for gratuity rate, the program displays
 * $1.2 as gratuity and $11.2 as total.
 */
package financialapplication;

import java.util.Scanner;
/**
 *
 * @author Edgar Santana
 */
public class FinancialApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double subtotal;
        double gratuityRate;
        double gratuity;
        double total;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the subtotal: ");
        subtotal = keyboard.nextDouble();
        
        System.out.print("Enter the gratuity rate: ");
        gratuityRate = keyboard.nextDouble();
        
        gratuity = subtotal * (gratuityRate / 100);
        
        total = subtotal + gratuity;
        
        System.out.println("The gratuity is $" + gratuity +
                " and total is $" + total);
    }
    
}
