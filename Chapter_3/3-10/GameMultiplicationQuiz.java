/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 3.10 (Game: multiplication quiz) Listing 3.3 SubtractionQuiz.java, randomly 
 * generates a subtraction question. Revise the program to randomly generate a 
 * multiplication question with two integers less than 1000.
 */

package gamemultiplicationquiz;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class GameMultiplicationQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Generate two random single-digit integers
        int number1 = (int)(Math.random() * 1000);
        int number2 = (int)(Math.random() * 1000);
        
        // 2. If number1 < number2, swap number1 with number2
        if(number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        // 3. Prompt the student to answer "What is number1 - number2?"
        System.out.print("What is " + number1 + " * " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        
        // 4. Grade the answer and display the result
        if(number1 * number2 == answer) 
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " * " + number2 +
                    " should be " + (number1 * number2));
        }
    }
    
}
