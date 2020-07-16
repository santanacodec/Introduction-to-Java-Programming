/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 4.5 (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 * in which all sides are of the same length and all angles have the same degree (ie.,
 * the polygon is both equilateral and equiangular). The formula for computing the 
 * area of a regular polygon is 
 * 
 *                         Area = n * s^2 / 4 * tan(PI/n)
 * 
 * Here, s is the length of a side. Write program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area. 
 */

package geometryareaofregularpolygon;

import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class GeometryAreaOfRegularPolygon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double numOfSides,
               sideLength,
               area;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of sides: ");
        numOfSides = input.nextDouble();
        
        System.out.print("Enter the side length: ");
        sideLength = input.nextDouble();
        
        area = (numOfSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numOfSides));
        
        System.out.println("The area of the polygon is: " + area);
    }
    
}
