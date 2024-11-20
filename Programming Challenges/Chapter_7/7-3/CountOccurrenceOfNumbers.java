/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 7.3 (Count occurrence of numbers) Write a program that reads the integers between
 * 1 and 50 and counts the occurrences of each. Assume the input ends with 0.
 */

package countoccurrenceofnumbers;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class CountOccurrenceOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers;
        int i;
        
        Scanner scanner = new Scanner(System.in);
        
        numbers = new int[50];
        
        for (i = 0; i < 50; i++) {
            numbers[i] = 0;
        }
        
        System.out.print("Enter the integers between 1 and 100: ");
        i = scanner.nextInt();
        
        while (i != 0) {
            numbers[i]++;
            
            i = scanner.nextInt();
        }
        
        for (i = 0; i < 50; i++) {
            if (numbers[i] != 0) {
                if (numbers[i] == 1) {
                    System.out.println(i + " occurs " + numbers[i] + " time.");
                } else {
                    System.out.println(i + " occurs " + numbers[i] + " times.");
                }
            }
        }
    }    
}
