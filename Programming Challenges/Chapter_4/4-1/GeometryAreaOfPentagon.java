/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 4.1 (Geometry: area of a pentagon) Write a program that prompts the user to 
 * enter the length from the center of a pentagon to a vertex and computes the 
 * area of the pentagon.
 * The formula for computing the area of a pentagon is 
 * 
 *      Area = (5 * s^2)/(4 * tan(pi/5))
 * 
 * where s is the length of a side. The side can be computed using the formula 
 * 
 *      s = 2r sin(pi/5) 
 * 
 * where r is the length from the center of a pentagon to a vertex. Round up two 
 * digits after the decimal point. 
 */

package geometryareaofpentagon;

import java.util.Scanner;
/**
 *
 * @author Edgar Santana
 */
public class GeometryAreaOfPentagon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area;
        double r;
        double s;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length from the center to a vertex: ");
        r = input.nextDouble();
        
        s = 2*r *(Math.sin(Math.PI / 5));
        
        area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/5));
        
        System.out.println("The area of the pentagon is " + Math.round(area * 100.0)/100.0);
    }
    
}
