/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 6.5 (Sort Three Numbers) Write a method with the following header to display 
 * three numbers in decreasing order:
 * 
 * public static void displaySortedNumbers(double num1, double num2, double num3)
 * 
 * Write a test program that prompts the user to enter three numbers and invokes 
 * the method to display them in decreasing order.
 */

package sortthreenumbers;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class SortThreeNumbers {

    /**
     * @param args the command line arguments
     */
    
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 >= num2 && num2 >= num3) {
            System.out.println(num1 + "\n" + num2 + "\n" + num3);
        } else if (num1 <= num2 && num2 <= num3) {
            System.out.println(num3 + "\n" + num2 + "\n" + num1);
        } else if (num2 >= num1 && num1 >= num3) {
            System.out.println(num2 + "\n" + num1 + "\n" + num3);
        } else if (num2 >= num3 && num3 >= num1) {
            System.out.println(num2 + "\n" + num3 + "\n" + num1);
        } else if (num3 >= num1 && num1 >= num2) {
            System.out.println(num3 + "\n" + num1 + "\n" + num2);
        } else if (num1 >= num2 && num2 <= num3) {
            System.out.println(num1 + "\n" + num3 + "\n" + num2);
        }     
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first of three numbers: ");
        a = scanner.nextInt();
        
        System.out.print("Enter your second of three numbers: ");
        b = scanner.nextInt();
        
        System.out.print("Enter your third of three numbers: ");
        c = scanner.nextInt();
        
        displaySortedNumbers(a, b, c);
    }    
}
