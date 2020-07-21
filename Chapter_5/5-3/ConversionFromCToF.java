/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 5.3 (Conversion from C to F) Write a program that displays the following table
 * (note that Fahrenheit = Celsius * 9/5 + 32):
 * 
 * Celsius     Fahrenheit
 * 0                 32.0
 * 2                 35.6
 * ...
 * 98               208.4
 * 100              212.0
 */

package conversionfromctof;

/**
 *
 * @author Edgar Santana
 */
public class ConversionFromCToF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int NUMBER_OF_CELSIUS = 100;
        int count = 0;
        double celsius,
               fahrenheit;
        
        System.out.println("Celsius     Fahrenheit");
        
        while (count <= NUMBER_OF_CELSIUS) {
            celsius = count;
            fahrenheit = celsius * 9/5 + 32;
            System.out.println(celsius + "              " + fahrenheit);
            count+=2;
        }   
    }   
}
