/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 7.1 (Assign Grades) Write a program that reads student scores, gets the best 
 * score, and then assigns grades based on the following scheme:
 * Grade is A if score is >= best - 5
 * Grade is B if score is >= best -10;
 * Grade is C if score is >= best -15;
 * Grade is D if score is >= best -20;
 * Grade is F otherwise.
 * The program prompts the user to enter the total number of students, and then 
 * prompts the user to enter all of the scores, and concludes by displaying the 
 * grades.
 */

package assigngrades;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class AssignGrades {

    /**
     * @param args the command line arguments
     */
    public static String grades(int best, int score) {
        if (score >= best - 5) {
            return "A";
        } else if (score >= best - 10) {
            return "B";
        } else if (score >= best - 15) {
            return "C";
        } else if (score >= best - 20) {
            return "D";
        } else {
            return "F";
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] scores;
        int students;
        int best = 0;
        int tick = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        students = input.nextInt();
        
        scores = new int[students];
        
        System.out.print("Enter " + students + " scores: ");
        for(int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();            
        }
        
        best = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(best < scores[i]) {
                best = scores[i];
            }
        }
        for (int i = 0; i < students; i++) {
            System.out.println("student " + tick + " score is " + scores[i] + 
                    " and grade is " + grades(best, scores[i]));
            tick++;
        }
    }   
}
