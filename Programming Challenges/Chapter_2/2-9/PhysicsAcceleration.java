/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 2.9 (Physics: acceleration) Average acceleration is defined as the change of 
 * velocity divided by the time taken to make the change, as given by the following 
 * formula: a = (v1-v0) / t
 * 
 * Write a program that prompts the user to enter the starting velocity v0 in 
 * meters/second, the ending velocity v1 in meters/second, and the time span t 
 * in seconds, then displays the average acceleration.
 */

package physicsacceleration;

import java.util.Scanner;
/**
 *
 * @author Edgar Santana
 */
public class PhysicsAcceleration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v0;
        double v1;
        double t;
        double acceleration;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter v0: ");
        v0 = keyboard.nextDouble();
        
        System.out.print("Enter v1: ");
        v1 = keyboard.nextDouble();
        
        System.out.print("Enter t: ");
        t = keyboard.nextDouble();
        
        acceleration = (v1 - v0) / t;
        
        System.out.println("The average acceleration is " + acceleration);
    }
    
}
