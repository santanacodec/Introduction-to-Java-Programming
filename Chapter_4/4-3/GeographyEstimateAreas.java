/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 4.3 (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia; 
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the figure
 * in Section 4.1 to compute the estimated area enclosed by these four cities. 
 * (Hint: Use the formula in Programming Exercise 4.2 to compute the distance between
 * two cities. Divide the polygon into two triangles and use the formula in Programming
 * Exercise 2.19 to compute the area of a triangle.)
 */

package geographyestimateareas;

import java.lang.Math;

/**
 *
 * @author Edgar Santana
 */
public class GeographyEstimateAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double atlantaLong = Math.toRadians(33.7489954),
               atlantaLat = Math.toRadians(-84.3879823),
               orlandoLong = Math.toRadians(28.5383355),
               orlandoLat = Math.toRadians(-81.3792365),
               savannahLong = Math.toRadians(32.0835407),
               savannahLat = Math.toRadians(-81.0998342),
               charlotteLong = Math.toRadians(35.2270869),
               charlotteLat = Math.toRadians(-80.8431267),
               radius = 6371.01,
               distance1,
               distance2,
               distance3,
               distance4,
               triangleSplit,
               triangle1,
               triangle2,
               s1,
               s2,
               estimatedArea;
        
        distance1 = radius * Math.acos(Math.sin(atlantaLat) * Math.sin(charlotteLat) + 
                Math.cos(atlantaLat) * Math.cos(charlotteLat) * Math.cos(atlantaLong - charlotteLong));
        
        distance2 = radius * Math.acos(Math.sin(charlotteLat) * Math.sin(savannahLat) + 
                Math.cos(charlotteLat) * Math.cos(savannahLat) * Math.cos(charlotteLong - savannahLong));
        
        distance3 = radius * Math.acos(Math.sin(savannahLat) * Math.sin(orlandoLat) + 
                Math.cos(savannahLat) * Math.cos(orlandoLat) * Math.cos(savannahLong - orlandoLong));
        
        distance4 = radius * Math.acos(Math.sin(orlandoLat) * Math.sin(atlantaLat) + 
                Math.cos(orlandoLat) * Math.cos(atlantaLat) * Math.cos(orlandoLong - atlantaLong));
        
        triangleSplit = radius * Math.acos(Math.sin(atlantaLat) * Math.sin(savannahLat) + 
                Math.cos(atlantaLat) * Math.cos(savannahLat) * Math.cos(atlantaLong - savannahLong));
        
        s1 = (distance1 + distance2 + triangleSplit) / 2;
        
        s2 = (distance3 + distance4 + triangleSplit) / 2;
        
        triangle1 = Math.sqrt(s1 *(s1 - distance1)*(s1 - distance2)*(s1 - triangleSplit));
        
        triangle2 = Math.sqrt(s2 *(s2 - distance3)*(s2 - distance4)*(s2 - triangleSplit));
        
        estimatedArea = triangle1 + triangle2;
        
        System.out.println("The estimated are of Atlanta, Charlotte, and Savannah is: " + triangle1);
        System.out.println("The estimated are of Savannah, Orlando, and Atlanta is: " + triangle2);
        System.out.println("The estimated area of all 4 cities is: " + estimatedArea);
    }
    
}
