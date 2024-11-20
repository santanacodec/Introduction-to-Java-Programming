/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 5.4 (Conversion from inch to centimeter) Write a program that displays the
 * following table (note that 1 inch is 2.54 centimeters):
 * 
 * Inches     Centimeters
 * 1          2.54
 * 2          5.08
 * ...
 * 9          22.86
 * 10         25.4
 */

package conversionfrominchtocentimeter;

/**
 *
 * @author Edgar Santana
 */
public class ConversionFromInchToCentimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NUMBER_OF_INCHES = 10;
        int count = 1;
        int inches;
        double centimeters;
        
        System.out.println("Inches     Centimeters");
        
        while(count <= 10) {
            inches = count;
            centimeters = inches * 2.54;
            System.out.println(inches + "              " + centimeters);
            count++;
        }            
    }   
}
