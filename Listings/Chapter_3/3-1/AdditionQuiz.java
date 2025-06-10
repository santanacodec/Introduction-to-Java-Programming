/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.additionquiz;

import java.util.Scanner;

/**
 *
 * @author <Edgar Santana>
 */
public class AdditionQuiz {

    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
	int number2 = (int)(System.currentTimeMillis() / 10 % 10);
	
	// Create Scanner
	Scanner input = new Scanner(System.in);
	
	System.out.print(
		"What is " + number1 + " + " + number2 + "? ");
	
	int answer = input.nextInt();
	
	System.out.println(
		number1 + " + " + number2 + " = " + answer + " is " +
			(number1 + number2 == answer));
    }
}
