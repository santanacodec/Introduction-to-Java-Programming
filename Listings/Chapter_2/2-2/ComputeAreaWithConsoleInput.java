/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.computeareawithconsoleinput;

import java.util.Scanner;
/**
 *
 * @author <Edgar Santana>
 */
public class ComputeAreaWithConsoleInput {

    public static void main(String[] args) {
        // Create a Scanner object
	Scanner input = new Scanner(System.in);
	
	// Prompt the user to enter a radius
	System.out.print("Enter a number for radius: ");
	double radius = input.nextDouble();
	
	// Computer area
	double area = radius * radius * 3.14159;
	
	// Display results
	System.out.println("The area for the circle of radius " +
		radius + " is " + area);
    }
}
