/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 * 9.1 (The Rectangle Class) Following the example of the Circle class in Section 9.2
 * design a class named Rectangle to represent a rectangle. The class contains: 
 * 
 * - Two double data fields named width and height that specify the width and height
 * of the rectangle. The default values are 1 for both width and height.
 * - A no-arg constructor that creates a default rectangle.
 * - A constructor that creates a rectangle with the specified width and height.
 * - A Method named getArea() that returns the area of this rectangle.
 * - A method named getPerimeter() that returns the perimeter.
 * 
 * Draw the the UML diagram for the class then implement the class. Write a test
 * program that creates two Rectangle objects - one with width 4 and height 40, 
 * and the other with width 3.5 and height 35.9 Display the width, height, area, 
 * and perimeter of each rectangle in this order.
 */

package therectangleclass;

/**
 *
 * @author Edgar Santana
 */
public class TheRectangleClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TheRectangleClass rectangle1 = new TheRectangleClass(4, 40);
        System.out.println("Rectangle1 width: " + rectangle1.width + 
                "\nRectangle1 height: " + rectangle1.height +
                "\nRectangle1 area: " + rectangle1.getArea() + 
                "\nRectangle1 perimeter: " + rectangle1.getPerimeter());
       
        TheRectangleClass rectangle2 = new TheRectangleClass(3.5, 35.9);
        System.out.println("Rectangle2 width: " + rectangle2.width + 
                "\nRectangle2 height: " + rectangle2.height +
                "\nRectangle2 area: " + rectangle2.getArea() + 
                "\nRectangle2 perimeter: " + rectangle2.getPerimeter());
    }
    
    double width;
    double height;
    
    TheRectangleClass() {
        width = 1;
        height = 1;
    }
    TheRectangleClass(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    
    double getArea() {
        return width * height;
    }
    
    double getPerimeter() {
        return 2 * (height + width);
    }
}
