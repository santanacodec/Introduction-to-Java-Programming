/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.computearea;

/**
 *
 * @author <Edgar Santana>
 */
public class ComputeArea {

    public static void main(String[] args) {
        double radius; // Declare radius
	double area; // Declare area
	
	// Assign a radius
	radius = 20; // radius is now 20
	
	// Compute area
	area = radius * radius * 3.14159;
	
	// Display results
	System.out.println("The area for the circle of radius " +
		radius + " is " + area);
    }
}
