/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 9.5 (Use the Gregorian Calendar class) Java API has the Gregorian Calendar class
 * in the java.util package, which you can use to obtain the year, month, and day 
 * or a date. The no-arg constructor constructs an instance for the current date, and
 * the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), and 
 * get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day. Write a 
 * program to perform two tasks:
 * 1. Display the current year, month, and day.
 * 2. The GregorianCalendar class has the setTimeInMillis(long), which can be used 
 *   to set a specified elapsed time since January 1, 1970. Set the value to 
 *   1234567898765L and display the year, month, and day.
 */
package usethegregoriancalendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Edgar Santana
 */
public class UseTheGregorianCalendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       GregorianCalendar gregCalendar = new GregorianCalendar();
       
       System.out.println("Todays date");
       System.out.println(gregCalendar.get(gregCalendar.YEAR) + "/" + 
               gregCalendar.get(gregCalendar.MONTH) + "/" + 
               gregCalendar.get(gregCalendar.DAY_OF_MONTH));
       
       gregCalendar.setTimeInMillis(1234567898765L);
       System.out.println("Elapsed time");
       System.out.println(gregCalendar.get(gregCalendar.YEAR) + "/" + 
               gregCalendar.get(gregCalendar.MONTH) + "/" + 
               gregCalendar.get(gregCalendar.DAY_OF_MONTH));

    }   
}
