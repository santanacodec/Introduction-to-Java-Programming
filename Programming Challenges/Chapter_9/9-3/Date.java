/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 9.3 (Use the Date class) Write a program that creates a Date object, sets its 
 * elapsed time to 10000, 100000, 10000000, 100000000, 1000000000, 10000000000, 
 * and 100000000000, and displays the date and time using the toString() method,
 * respectively.
 */
package date;

/**
 *
 * @author Edgar Santana
 */
public class Date {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	java.util.Date date = new java.util.Date();
             
        System.out.println("elapsed time for 10000");
        date.setTime(10000);
        System.out.println(date.toString());
        System.out.println(" ");
        
        System.out.println("elapsed time for 100000");
        date.setTime(100000);
        System.out.println(date.toString());
        System.out.println(" ");
        
        System.out.println("elapsed time for 10000000");
        date.setTime(10000000);
        System.out.println(date.toString());
        System.out.println(" ");
        
        System.out.println("elapsed time for 100000000");
        date.setTime(100000000);
        System.out.println(date.toString());
        System.out.println(" ");
        
        System.out.println("elapsed time for 10000000000");
        date.setTime(10000000000l);
        System.out.println(date.toString());
        System.out.println(" ");
        
        System.out.println("elapsed time for 100000000000");
        date.setTime(100000000000l);
        System.out.println(date.toString());
        
    }  
}
