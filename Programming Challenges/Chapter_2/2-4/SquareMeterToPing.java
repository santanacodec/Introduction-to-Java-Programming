/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 2.4 (Convert square meter into ping) Write a program that converts square 
 * meter into ping. The program prompts the user to enter a number in square meter, 
 * converts it to pint, and displays the result. One square meter is 0.3025 ping.
 */
package squaremetertoping;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class SquareMeterToPing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double meters;
        double pings;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a number in square meters: ");
        meters = keyboard.nextDouble();
        
        pings = meters * 0.3025;
        
        System.out.println(meters + " square meters is " + pings + " pings.");
    }
    
}
