/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 2.10 (Science: calculating energy) Write a program that calculates the energy 
 * needed to heat water from an initial temperature to a final temperature. Your 
 * program should prompt the user to enter the amount of water in kilograms and the 
 * initial and final temperatures of the water. The formula to compute the energy is
 * 
 * Q = M * (finalTemperature - initialTemperature) * 4184
 * 
 * where M is the weight of water in kilograms, initial and final temperatures are in
 * degrees Celsius, and energy Q is measured in joules.
 */
package calculatingenergy;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class CalculatingEnergy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double M;
        double initialTemperature;
        double finalTemperature;
        double Q;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in kilograms: ");
        M = keyboard.nextDouble();
        
        System.out.print("Enter the initial temperature: ");
        initialTemperature = keyboard.nextDouble();
        
        System.out.print("Enter the final temperature: ");
        finalTemperature = keyboard.nextDouble();
        
        Q = M * (finalTemperature - initialTemperature) * 4184;
        
        System.out.println("The energy needed is " + Q);
    }   
}
