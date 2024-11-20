/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 7.2 (Comparing Numbers) Write a program that reads 11 integers, compares each 
 * integer with the 11th integer, and displays whether the integers are "greater",
 * "smaller", or "equal" to the 11th integer.
 */

package comparingnumbers;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class ComparingNumbers {

    /**
     * @param args the command line arguments
     */
    public static String compareIntegers (int eleventhInt, int comparedInt) {
        if ( comparedInt > eleventhInt) {
            return "greater than";
        } else if (comparedInt == eleventhInt) {
            return "equal to";
        } else if (comparedInt < eleventhInt) {
            return "smaller than";
        } else {
            return null;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] integers;
        int eleventhInt;
        
        Scanner input = new Scanner(System.in);
        
        integers = new int[11];
        System.out.print("Enter 11 integers: ");
        for (int i = 0; i < integers.length; i++) {
            integers[i] = input.nextInt();
        }
        
        eleventhInt = integers[10];
        
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i] + " is " + 
                    compareIntegers(eleventhInt, integers[i]) + " the eleventh integer");
        }
    }    
}
