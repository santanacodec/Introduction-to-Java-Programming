/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 6.4 (Display an integer reversed) Write a method with the following header to 
 * display an integer in reverse order:
 * 
 * public static void reverse(int number)
 * 
 * For example, reverse(3456) displays 6543. Write a test program that prompts the
 * user to enter an integer then displays its reversal.
 */

package displayanintegerreveresed;

import java.util.Scanner;
/**
 *
 * @author Edgar Santana
 */
public class DisplayAnIntegerReveresed {

    /**
     * @param args the command line arguments
     */
    
    public static void reverse(int number) {
        int reverseNum = 0;
        while(number !=0) {
            int digits = number %10;
            reverseNum = reverseNum * 10 + digits;
            number /= 10;
        }
        System.out.println("Your number in reverse order is: " + reverseNum);        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter a number to display in reverse order: ");
        num = scanner.nextInt();
        
        reverse(num);
    }
    
}
