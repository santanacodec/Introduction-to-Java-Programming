/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 6.3 (Palindrome integer) Write the methods with the following headers:
 * 
 * // Return the reversal of an integer,.e.g., reverse(456) returns 654
 * public static int reverse(int number)
 * 
 * // Return true if number is a palindrome
 * public static boolean isPanindrome(int number)
 * 
 * Use the reverse method to implement isPanindrome. A number is a palindrome if 
 * its reversal is the same as itself. Write a test program that prompts the user
 * to enter an integer and reports whether the integer is a palindrome.
 */

package palindromeinteger;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class PalindromeInteger {

    /**
     * @param args the command line arguments
     */
    public static int reverse(int number) {
        int reverseNum = 0;
        while(number !=0) {
            int digits = number %10;
            reverseNum = reverseNum * 10 + digits;
            number /= 10;
        }
        return reverseNum;
    }
    
    public static boolean isPalindrome (int number) {
        int num = reverse(number);
        if (num == number ) {
            return true;
        } else {
            return false;
        }      
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        int reverseNum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number to check if it is a palindrome: ");
        number = scanner.nextInt();
        
        reverseNum = reverse(number);
        System.out.println("Your number reversed is: " + reverseNum);
        
        if (isPalindrome(reverseNum) == true) {
            System.out.println("The number you entered is a palindrome");
        } else if (isPalindrome(reverseNum) == false) {
            System.out.println("The number you entered is NOT a palindrome");
        }
    }
    
}
