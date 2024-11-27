/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.computeareawithconstant;

import java.util.Scanner;

/**
 *
 * @author <Edgar Santana>
 */
public class ComputeAreaWithConstant {

    public static void main(String[] args) {
        final double PI = 3.14159; // Declare a constant
	
	// Create a Scanner object
	Scanner input = new Scanner(System.in);
	
	// Prompt the user to enter a radius 
	System.out.println("Enter a number for radius: ");
	double radius = input.nextDouble();
	
	// Compute area
	double area = radius * radius * PI;
	
	// Display result
	System.out.println("The area for the circle of radius " +
		radius + " is " + area);
    }
}
