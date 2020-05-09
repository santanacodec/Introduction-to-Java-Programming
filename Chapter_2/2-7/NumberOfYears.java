/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 2.7 (Find the number of years) Write a program that prompts the user to enter 
 * the minutes (e.g., 1 billion), and displays the number of years and remaining 
 * days for the minutes. For simplicity, assume that a year has 365 days.
 */
package numberofyears;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class NumberOfYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int minutes;
        int years;
        int days;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        minutes = keyboard.nextInt();
        
        years = minutes / 525600;
        
        days = (minutes % 525600) / 1440;
        
        System.out.println(minutes + " minutes is approximately " + years +
                           " years and " + days + " days.");
    }
    
}
