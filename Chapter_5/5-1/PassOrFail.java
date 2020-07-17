/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 5.1 (Pass or fail) Write a program that prompts a student to enter a Java score.
 * If the score is greater or equal to 60, display "you pass the exam"; otherwise,
 * display "you don't pass the exam". Your program ends with input -1.
 */

package passorfail;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class PassOrFail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int score;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your score: ");
        score = input.nextInt();
        
        if (score >= 60) {
            System.out.println("You pass the exam.");
        } else {
            System.out.println("You don't pass the exam.");
        }
    }
    
}
