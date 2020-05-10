/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 3.1 (Algebra: solve quadratic equations) The two roots of a quadratic equation 
 * ax^2 + bx + c = 0; can be obtained using the following formula:
 * 
 * r1 = (-b + sqrt[b2 - 4ac])/ 2a and r2 = (-b -sqrt[b2 - 4ac])/ 2a
 * 
 * b2 - 4ac is called the discriminant of the quadratic equation. If it is positive,
 * the equation has two real roots. If it is zero, the equation has one root. If it 
 * is negative, the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display 
 * two roots. If the discriminant is 0, display one root. Otherwise, display "The 
 * equation has no real roots."
 * Note you can use Math.pow(x, 0.5) to compute sqrt[x].
 */

package algebraquadraticequations;

import java.util.Scanner;
/**
 *
 * @author Edgar Santana
 */
public class AlgebraQuadraticEquations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a, b, c, r1, r2; 
        
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        a = keyboard.nextDouble();
        
        System.out.print("Enter b: ");
        b = keyboard.nextDouble();
        
        System.out.print("Enter c: ");
        c = keyboard.nextDouble();
        
        double discriminate = (b*b)-(4*a*c);
        
        System.out.println(discriminate);
        
        r1 = (-b + Math.pow(discriminate, 0.5))/ 2*a;
        
        r2 = (-b - Math.pow(discriminate, 0.5))/ 2*a;
        
        if(discriminate > 0) {
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (discriminate == 0) {
            System.out.println("The equation has one root " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
    
}
