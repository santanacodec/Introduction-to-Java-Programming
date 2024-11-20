/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 5.5 (Conversion from C to F and F to C) Write a program that displays the following
 * two tables side by side:
 * 
 * Celsius     Fahrenheit   |   Fahrenheit     Celsius
 * 0               32.000       20             -6.667
 * 2               35.600   |   25             -3.889
 * ...
 * 98             208.400   |   265           129.444
 * 100            212.000   |   270           132.222
 */

package conversionfromctofandftoc;

/**
 *
 * @author Edgar Santana
 */
public class ConversionFromCToFAndFToC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NUMBER_OF_CELSIUS = 100;
        int count = 0;
        int tick = 20;
        double celsius,
               fahrenheit;
        double celsius2,
               fahrenheit2;
        
        System.out.println("Celsius     Fahrenheit   |   Fahrenheit     Celsius");
        
        while (count <= NUMBER_OF_CELSIUS) {
            celsius = count;
            fahrenheit = celsius * 9/5 + 32;
            fahrenheit2 = tick;
            celsius2 = (fahrenheit2 - 32.0) * (5.0/9.0);
            System.out.println(celsius + "              " + fahrenheit + "   |   " + 
                    fahrenheit2 + "           " + (double)Math.round(celsius2 * 1000d) / 1000d);
            count+=2;
            tick+=5;
        }   
    }
    
}
