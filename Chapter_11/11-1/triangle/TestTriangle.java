/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class TestTriangle {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        String color = "";
        String answer;
        boolean isFilled = false;
        
        
        
        System.out.println("What color is your triangle? ");
        color = input.nextLine();
        
        System.out.println("Is your triangle Filled? (true or false)");
        isFilled = input.nextBoolean();
        
        System.out.println("Please enter side 1 of a triangle: ");
        side1 = input.nextDouble();
        
        System.out.println("Please enter side 2 of a triangle: ");
        side2 = input.nextDouble();
        
        System.out.println("Please enter side 3 of a triangle: ");
        side3 = input.nextDouble();
        
        
        System.out.println("----------------------------");
        Triangle triangle = new Triangle(side1, side2, side3, color, isFilled);
        System.out.println(triangle.toString());
        
        System.out.println("The area of the triangle is: " + triangle.getArea());
        System.out.println("The Perimeter of the triangle is: " + triangle.getPerimeter());
        
        System.out.println("The color of your triangle is: " + triangle.getColor());
        System.out.println("Is the triangle filled? " + triangle.isFilled());
                 
    }
}
