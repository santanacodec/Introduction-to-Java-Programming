/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 2.2 (Compute the volume of a triangle) Write a program that reads in the length
 * of sides of an equilateral triangle and computes the area and volume using the
 * following formulas:
 * 
 * volume = area * length
 */
package computevolumeoftriangle;
import java.util.Scanner;
/**
 *
 * @author Edgar Santana
 */
public class ComputeVolumeOfTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double length = 0.0;
        double volume = 0.0;
        double area = 0.0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the length of the sides of the "
                + "equilateral triangle: ");
        length = keyboard.nextDouble();
        
        area = (1.732/4) * (length * length);
        
        volume = area * length;
        
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
        
    }
    
}
