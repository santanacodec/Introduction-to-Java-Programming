/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 10.4 (The MyPoint class) Design a class named MyPoint to represent a point with
 * x- and y-coordinates. The class contains:
 * 
 * - The data fields x and y that represent the coordinates with getter methods.
 * - A no-arg constructor that creates a point (0, 0).
 * - A constructor that constructs a point with specified coordinates.
 * - A method named distance that returns the distance from this point to a 
 *   specified point of the MyPoint type.
 * - A method named distance that returns the distance from this point to another
 *   point with specified x- and y-coordinates.
 * - A static method named distance that returns the distance from two MyPoint 
 *   objects.
 * 
 * Draw the UML diagram for the class then implement the class. Write a test 
 * program that creates the two points (0, 0) and (10, 30.5) and displays the 
 * distance between them.
 */
package mypoint;
import java.lang.Math;

/**
 *
 * @author Edgar Santana
 */
public class MyPoint {

    /**
     * @param args the command line arguments
     */
    private double x;
    private double y;
    
    public MyPoint() {
        this(0, 0);
    }
    
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double distance() {
        double thisX = 0;
        double thisY = 0;
        double distance = Math.sqrt(Math.pow(x - thisX, 2) + Math.pow(y - thisY, 2));
        return distance;
    }
    
    public double distance(double xD, double yD) {
        double distance = Math.sqrt(Math.pow(xD - x, 2) + Math.pow(yD - y, 2));
        return distance;
    }
    
    public static double distance(MyPoint point1, MyPoint point2) {
        double distance = Math.sqrt(Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2));
        return distance;
    }
}
