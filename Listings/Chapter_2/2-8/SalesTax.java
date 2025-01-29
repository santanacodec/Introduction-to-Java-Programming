/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.salestax;

import java.util.Scanner;

/**
 *
 * @author <Edgar Santana>
 */
public class SalesTax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	System.out.print("Enter purchase amount: ");
	double purchaseAmount = input.nextDouble();
	
	double tax = purchaseAmount * 0.06;
	System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
    }
}
