/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 * 7.4 (Analyze Scores) Write a program that reads an unspecified number of scores
 * and determines how many scores are above or equal to the average, and how many
 * scores are below the average. Enter a negative number to signify the end of the 
 * input. Assume the maximum number of scores is 100.
 */

package analyzescores;

import java.util.Scanner;
/**
 *
 * @author Edgar Santana
 */

public class AnalyzeScores {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] scores = new int[100];
        int number = 0;
        int average = 0;
        int tick = 0;
        int aboveOrEqual = 0;
        int below = 0;
        
        System.out.println("Enter some scores. Enter a negative number to quit input");
        for (int i = 0; i < scores.length; i++) {
            number = input.nextInt();
            if (number < 0) {
                break;
            }
            scores[i] = number;
            System.out.println(scores[i]);
            average += number;
            tick++;                        
        }
        
        average /= tick;
        
        for(int i = 0; i < tick; i++) {
            if(scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }
        System.out.println("Your average is score is: " + average); 
        System.out.println("Numbers above or equal to average: " + aboveOrEqual);
        System.out.println("Numbers below average: " + below);
    }    
}
