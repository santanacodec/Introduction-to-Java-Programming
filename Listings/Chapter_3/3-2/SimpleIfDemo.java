/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simpleifdemo;

import java.util.Scanner;

/**
 *
 * @author <Edgar Santana>
 */
public class SimpleIfDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer: ");
	int number = input.nextInt();
	
	if (number % 5 == 0)
		System.out.println("HiFive");
	
	if (number % 2 == 0)
		System.out.println("HiEven");
    }
}
