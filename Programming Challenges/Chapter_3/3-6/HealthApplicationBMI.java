/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java,
 * to let the user enter weight, feet, and inches. For example, if a person is 
 * 5 feet and 10 inches, you will enter 5 for feet and 10 inches.
 */
package healthapplicationbmi;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class HealthApplicationBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        // Prompt the user to enter Feet
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        
        double inchesInFeet = 12.0 * feet;
        
        // Prompt the user to enter inches
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        
        double height = inchesInFeet + inches;
        
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        
        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        
        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");       
    }    
}
