/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 7.5 (The number of even numbers and odd numbers) Write a program that reads ten
 * integers, and then displays the number of even numbers and odd numbers. Assume
 * that the input ends with 0.
 */

package thenumberofevenandoddnumbers;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class TheNumberOfEvenAndOddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int[] numbers = new int[10];  
        int digits = 0;
        int odd = 0;
        int even = 0;
        int tick = 0;
        
        System.out.print("Enter numbers: ");
        for(int i = 0; i < numbers.length; i++) {
            digits = input.nextInt();
            if (digits == 0) {
                break;
            }
            numbers[i] = digits;
            tick++;
        }
        for (int i = 0; i < tick; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        System.out.println("The number of odd number: " + odd);
        System.out.println("The number of even number: " + even);
    } 
}
