/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 3.4 (Random month) Write a program that randomly generates an integer between 
 * 1 and 12 and displays the English month January, February,..., December for the 
 * numbers 1, 2,..., 12, accordingly.
 */

package randommonth;

import java.util.Random;

/**
 *
 * @author Edgar Santana
 */
public class RandomMonth {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int month;
        
        Random random = new Random();
        month = 1 + random.nextInt(12 - 1 + 1);
        
        switch(month) {
            case 1: System.out.println("January for " + month); break;
            case 2: System.out.println("February for " + month); break;
            case 3: System.out.println("March for " + month); break;
            case 4: System.out.println("April for " + month); break;
            case 5: System.out.println("May for " + month); break;
            case 6: System.out.println("June for " + month); break;
            case 7: System.out.println("July for " + month); break;
            case 8: System.out.println("August for " + month); break;
            case 9: System.out.println("September for " + month); break;
            case 10: System.out.println("October for " + month); break;
            case 11: System.out.println("November for " + month); break;
            case 12: System.out.println("December for " + month); break;
        }
    }
    
}
