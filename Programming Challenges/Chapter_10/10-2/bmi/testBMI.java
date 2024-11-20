/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

/**
 *
 * @author Edgar Santana
 */
public class testBMI {
    public static void main(String[] args) {
        // TODO code application logic here
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " +
                bmi1.getBMI() + " " + bmi1.getStatus() + " at age: " + bmi1.getAge());
        
        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + bmi2.getName() + " is " +
                bmi2.getBMI() + " " + bmi2.getStatus() + " at age: " + bmi2.getAge());
        
        BMI bmi3 = new BMI("Kim Yang", 18, 145, 5, 10);
        System.out.println("The BMI for " + bmi3.getName() + " is " +
                bmi3.getBMIFeetInches() + " " + bmi3.getStatus() + " at age: " + bmi3.getAge());
        
    }  
}
