/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 3.2 (Game: multiply three numbers) The program in Listing 3.1, AdditionQuiz.java,
 * generates two integers and prompts the user to enter the product of these two 
 * integers. Revise the program to generate three single-digit integers and prompt 
 * the user to enter the multiplication of these three integers.
 */

package gamemultiplythreenumbers;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class GameMultiplyThreeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1 = (int)(System.currentTimeMillis()%10);
        int number2 = (int)(System.currentTimeMillis()/10 %10);
        int number3 = (int)(System.currentTimeMillis()/10 * 2 %10);
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is " + number1 + " * " + number2 + " * " +
                         number3 + "? ");
        int answer = keyboard.nextInt();
        
        System.out.println(number1 + " * " + number2 + " * " + number3 + 
                           " is " + (number1 * number2 * number3 == answer));
 
    }
    
}
