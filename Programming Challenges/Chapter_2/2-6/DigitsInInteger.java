/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 2.6 (Multiply the digits in an integer) Write a program that reads an integer 
 * between 0 and 1000 and multiplies all the digits in the integer. For example, 
 * if an integer is 932, the multiplication of all its digits is 54.
 * Hint: Use the % operator to extract digits, and use the / operator to remove the
 * extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */
package digitsininteger;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class DigitsInInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        int extractedDigits;
        int removedDigits;
        int extractedDigits2;
        int removedDigits2;
        int answer;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        number = keyboard.nextInt();
        
        extractedDigits = number % 10;
        removedDigits = number / 10;
        
        extractedDigits2 = removedDigits % 10;
        removedDigits2 = removedDigits / 10;

        if (removedDigits2 == 0) {
            removedDigits2 = 1;
        }
        
        
        answer = removedDigits2 * extractedDigits2 * extractedDigits;
        
        System.out.println("The multiplication of all digits in " +
                           number + " is " + answer);
        
        
    }
    
}
