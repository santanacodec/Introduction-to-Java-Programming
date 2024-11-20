/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 6.1 (Math: pentagonal numbers) A pentagonal number is defined as n(3n-1)/2 for
 * n = 1, 2, ..., and so on. Therefore, the first few numbers are 1, 5, 12, 22, ...
 * Write a method with the following header that returns a pentagonal number:
 * 
 * public static int getPentagonalNumber(int n)
 * 
 * For example, getPentagonalNumber(1) returns 1 and getPentagonalNumber(2) returns 5.
 * Write a test program that uses this method to display the first 100 pentagonal 
 * numbers with 10 numbers on each line. Use the %7d format to display each number.
 */

package mathpentagonalnumbers;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class MathPentagonalNumbers {

    /**
     * @param args the command line arguments
     */
    public static int getPentegonalNumber(int n) {
        int pentegonalNumber = n * (3*n - 1) / 2;
        return pentegonalNumber;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter an integer number to get Pentegonal Number: ");
        n = scanner.nextInt();
        
        System.out.println("Your pentegonal number is: " + getPentegonalNumber(n));
    }
    
}
