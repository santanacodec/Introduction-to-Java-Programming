/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 2.1 (Convert mile to kilometer) Write a program that reads a mile in a double
 * value from the console, converts it to kilometers, and displays the result.
 * The formula for the conversion is as follows:
 * 1 mile = 1.6 kilometers.
 */
package miletokilometer;

import java.util.Scanner;
/**
 *
 * @author Edgar Santana
 */
public class MileToKilometer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double kilometers = 0.0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter mile to convert to kilometers");
        int miles = keyboard.nextInt();
        
        kilometers = miles * 1.609;
        
        System.out.println(miles + " miles to kilometers is: " + kilometers + "km");
    }    
}
