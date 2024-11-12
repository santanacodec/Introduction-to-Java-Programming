/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.approximatepi;
/**
 * 1.7 (Approximate pi) Pi can be computed using the following formula:
 * 
 * pi = 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 +...)
 * 
 * Write a program that displays the result of 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
 * 
 * and 4 x ( 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13). Use 1.0 instead of 1 in your
 * program.
 */

/**
 *
 * @author <Edgar Santana>
 */
public class ApproximatePi {

    public static void main(String[] args) {
        System.out.println(4.0 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11));
	System.out.println(4.0 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13));
    }
}
