/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 * 4.2 (Geometry: great circle distance) The great circle distance is the distance
 * two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
 * latitude and longitude of two points. The great circle distance between the two
 * points can be computed using the following formula:
 * 
 *  d = radius x arccos(sin(x1) x sin(x2) + cos(x1) x cos(x2) x cos(y1 - y2))
 * 
 * Write a program that prompts the user to enter the latitude and longitude of 
 * two points on the earth in degrees and displays its great circle distance. The 
 * average radius of the earth is 6,371.01km. Note you need to convert the degrees
 * into radians using the Math.toRadians method since the Java trigonometric methods
 * use radians. The latitude and longitude degrees in the formula are for north and
 * west. Use negative to indicate south and east degrees.
 */

package geometrygreatcircledistance;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Edgar Santana
 */
public class GeometryGreatCircleDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        double distance, 
               latitude, 
               longitude, 
               latitude2, 
               longitude2,
               radius;
        
        System.out.print("Please enter point 1 latitude: ");
        latitude = Math.toRadians(scanner.nextDouble());
        
        System.out.print("Please enter point 1 longitude: ");
        longitude = Math.toRadians(scanner.nextDouble());
        
        System.out.print("Please enter point 2 latitude: ");
        latitude2 = Math.toRadians(scanner.nextDouble());
        
        System.out.print("Please enter point 2 longitude: ");
        longitude2 = Math.toRadians(scanner.nextDouble());
        
        radius = 6371.01;
        
        distance = radius * Math.acos(Math.sin(latitude) * Math.sin(latitude2) + Math.cos(latitude) * Math.cos(latitude2) * Math.cos(longitude - longitude2));
        
        System.out.println("The distance between the two points is " + distance);
    }
    
}
