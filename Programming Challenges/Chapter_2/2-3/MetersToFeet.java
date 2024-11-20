/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 2.3 (Convert meters into feet) Write a program that reads a number in meters,
 * converts it to feet, and displays the result. One meter is 3.2786 feet.
 */
package meterstofeet;

import java.util.Scanner;
/**
 *
 * @author Edgar Santana
 */
public class MetersToFeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double meters = 0.0;
        double feet = 0.0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a value for meter: ");
        meters = keyboard.nextDouble();
        
        feet = meters * 3.2786;
        
        System.out.println(meters + " meters is " + feet + " feet.");
        
    }
    
}
