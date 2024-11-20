/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 4.4 (Geometry: area of a hexagon) The area of a hexagon can be computed using 
 * the following formula (s is the length of a side):
 * 
 *                  Area = 6 * s^2 / 4 * tan(pi / 6)
 * 
 * Write a program that prompts the user to enter the side of a hexagon and displays
 * its area.
 */

package geometryareaofahexagon;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Edgar Santana
 */
public class GeometryAreaOfAHexagon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double side, 
               area;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the side: ");
        side = input.nextDouble();
        
        area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        
        System.out.println("The area of the hexagon is: " + area);
    }    
}
