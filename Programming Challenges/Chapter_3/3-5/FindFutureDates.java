/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 3.5 (Find future dates) Write a program that prompts the user to enter an integer
 * for today's day of the week (Sunday is 0, Monday is 1,..., and Saturday is 6).
 * Also prompt the user to enter the number of days after today for a future day 
 * and display the day of  the week.
 */

package findfuturedates;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class FindFutureDates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int day;
        int daysElapsed;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter today's day: ");
        day = keyboard.nextInt();
        
        System.out.print("Enter the number of days elapsed since today: ");
        daysElapsed = keyboard.nextInt();
        
        
        switch(day) {
            case 0: System.out.print("Today is Sunday"); break;
            case 1: System.out.print("Today is Monday"); break;
            case 2: System.out.print("Today is Tuesday"); break;
            case 3: System.out.print("Today is Wednesday"); break;
            case 4: System.out.print("Today is Thursday"); break;
            case 5: System.out.print("Today is Friday"); break;
            case 6: System.out.print("Today is Saturday"); break;
        }
        
        switch((day + daysElapsed) % 7) {
            case 0: System.out.print(" and the future day is Sunday \n"); break;
            case 1: System.out.print(" and the future day is Monday \n"); break;
            case 2: System.out.print(" and the future day is Tuesday \n"); break;
            case 3: System.out.print(" and the future day is Wednesday \n"); break;
            case 4: System.out.print(" and the future day is Thursday \n"); break;
            case 5: System.out.print(" and the future day is Friday \n"); break;
            case 6: System.out.print(" and the future day is Saturday \n"); break;
        }
    }
    
}
