/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 10.5 (Display the prime factors) Write a program that prompts the user to enter
 * a positive integer and displays all its smallest factors in decreasing order.
 * For example, if the integer is 120, the smallest factors are displayed as 
 * 5, 3, 2, 2, 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5)
 * and retrieve and display them in reverse order.
 */

package primefactors;
import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class PrimeFactors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a;
        Scanner input = new Scanner(System.in);
        StackOfIntegers stack = new StackOfIntegers();
//        for (int i = 0; i < 10; i++) 
//            stack.push(4);
//        while (!stack.empty())
//            System.out.print(stack.pop() + " ");
        
        System.out.println("Please enter an integer to get the smallest factors: ");
        a = input.nextInt();
        SmallestFactors(a, stack);
        
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        
                
        
        
    }
    
    public static void SmallestFactors(int number, StackOfIntegers stack) {
        int i = 2;
        while (number / i != 1) {
            if (number % i == 0) {
                stack.push(i);
                number /= i;
            }
            else
                i++;
        }
        stack.push(number);
    }
    
}
