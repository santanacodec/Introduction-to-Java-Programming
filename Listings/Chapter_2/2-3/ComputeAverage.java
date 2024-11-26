/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.computeaverage;

import java.util.Scanner;

/**
 *
 * @author <Edgar Santana>
 */
public class ComputeAverage {

    public static void main(String[] args) {
        // Create a Scanner object
	Scanner input = new Scanner(System.in);
	
	// Prompt the user to enter three numbers
	System.out.print("Enter three numbers: ");
	
	double number1 = input.nextDouble();
	double number2 = input.nextDouble();
	double number3 = input.nextDouble();
	
	// Compute Average
	double average = (number1 + number2 + number3) / 3;
	
	// Display Results
	System.out.println("The average of " + number1 + " " + number2 + " " +
		number3 + " is " + average);
    }
}
