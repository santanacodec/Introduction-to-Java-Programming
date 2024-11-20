/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 3.8 (Sort three integers) Write a program that prompts the user to enter three 
 * integers and display the integers in non-decreasing order.
 */

package sortthreeintegers;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class SortThreeIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your first of three integers: ");
        a = input.nextInt();
        
        System.out.print("Enter your second of three integers: ");
        b = input.nextInt();
        
        System.out.print("Enter your third of three integers: ");
        c = input.nextInt();
        
        if (a <= b && c >= b) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (a >= b && c >= a) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (c <= b && b <= a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        } else if (c <= a && a <= b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);           
        } else if ( b <= c && c <= a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);           
        } else {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
    
}
