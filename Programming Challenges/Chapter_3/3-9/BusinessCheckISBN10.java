/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) 
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
 * which is calculated from the other 9 digits using the following formula:
 * 
 *      (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
 *          d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 * 
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 
 * convention. Write a program that prompts the user to enter the first 9 digits 
 * and displays the 10-digit ISBN (including leading zeros). Your program should 
 * read the input as an integer.
 */

package businesscheckisbn.pkg10;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class BusinessCheckISBN10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
        int isbn;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first 9 digits of an ISBN integer: ");
        isbn = input.nextInt();
        
        d1 = isbn / 100000000;
        int remainingDigits = isbn % 100000000;
        
        d2 = remainingDigits / 10000000; 
        remainingDigits %= 10000000;
        
        d3 = remainingDigits / 1000000;
        remainingDigits %= 1000000;
        
        d4 = remainingDigits / 100000;
        remainingDigits %= 100000;
        
        d5 = remainingDigits / 10000; 
        remainingDigits %= 10000;
        
        d6 = remainingDigits / 1000; 
        remainingDigits %= 1000;
        
        d7 = remainingDigits / 100; 
        remainingDigits %= 100;
        
        d8 = remainingDigits / 10;
        remainingDigits %= 10;
        
        d9 = remainingDigits;
             
        d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
                d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        
        if (d10 == 10) {
            System.out.println("The ISBN-10 number is: " + isbn + "X");
        } else {
            System.out.println("The ISBN-10 number is: " + isbn + d10);
        }       
    }   
}
