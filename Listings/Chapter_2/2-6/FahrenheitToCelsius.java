/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fahrenheittocelsius;

import java.util.Scanner;

/**
 *
 * @author <Edgar Santana>
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	System.out.println("Enter a degree in Fahrenheit: ");
	double fahrenheit = input.nextDouble();
	
	// Convert Fahrenheit to Celsius
	double celsius = (5.0 / 9) * (fahrenheit - 32);
	System.out.println("Fahrenheit " + fahrenheit + " is " +
		celsius + " in Celsius");
    }
}
