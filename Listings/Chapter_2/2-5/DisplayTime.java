/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.displaytime;

import java.util.Scanner;

/**
 *
 * @author <Edgar Santana>
 */
public class DisplayTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	// Prompt the user for input
	System.out.print("Enter an integer for seconds: ");
	int seconds = input.nextInt();
	
	int minutes = seconds / 60; // Find minutes in seconds
	int remainingSeconds = seconds % 60; // Seconds remaining
	System.out.println(seconds + " seconds is " + minutes +
		" minutes and " + remainingSeconds + " seconds");
    }
}
