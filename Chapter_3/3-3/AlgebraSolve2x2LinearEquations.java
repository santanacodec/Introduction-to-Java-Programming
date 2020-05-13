/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 3.3 (Algebra: solve 2 x 2 linear equations) A linear equation can be solved 
 * using Cramer's rule given in Programming exercise 1.13. Write a program that 
 * prompts the user to enter a, b, c, d, e, and f and displays the result. If
 * ad - bc is 0, report that "The equation has no solution."
 */

package algebrasolve2x2linearequations;

import java.util.Scanner;
/**
 *
 * @author Edgar Santana
 */
public class AlgebraSolve2x2LinearEquations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a, b, c, d, e, f, x, y;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = keyboard.nextDouble();
        
        System.out.print("Enter b: ");
        b = keyboard.nextDouble();
        
        System.out.print("Enter c: ");
        c = keyboard.nextDouble();
        
        System.out.print("Enter d: ");
        d = keyboard.nextDouble();
        
        System.out.print("Enter e: ");
        e = keyboard.nextDouble();
        
        System.out.print("Enter f: ");
        f = keyboard.nextDouble();
        
        x = (e*d - b*f) / (a*d - b*c);
        
        y = (a*f - e*c) / (a*d - b*c);
        
        if ((a*d - b*c) == 0) {
            System.out.println("The equation has no solution.");
        }
        else {
            System.out.println("x is " + x + " and y is " + y);
        }
    }
    
}
