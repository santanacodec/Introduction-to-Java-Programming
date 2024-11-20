/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 6.2 (Sum the digits in an integer) Write a method that computes the sum of the 
 * digits in an integer. Use the following header:
 * 
 * public static int sumDigits(long)
 * 
 * For example, sumDigits(234) returns 9(= 2 + 3 + 4). (Hint: Use the % operator
 * to extract digits and the / operator to remove the extracted digit. For instance,
 * to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
 * (= 23). Use a loop to repeatedly extract and remove the digit until all the digits
 * are extracted. Write a test program that prompts the user to enter an integer then
 * displays the sum of all its digits.
 */

package sumthedigitsinaninteger;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class SumTheDigitsInAnInteger {

    /**
     * @param args the command line arguments
     */
    
    public static int sumDigits(long n) {
        int sum = 0;
        
       while (n != 0) {
            sum += n % 10;            
            n /= 10;
        }
        return sum;        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        long n;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter some digits: ");
        n = scanner.nextLong();
        
        System.out.println("The sum of the digits you entered is: " + sumDigits(n));       
    }    
}
