/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Edgar Santana
 */
public class GeometricObject {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;
    
    // Construct a default geometric object
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }
    
    // Construct a geometric object with the specified color and filled value
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    
    // Return color
    public String getColor() {
        return color;
    }
    
    // set a new color 
    public void setColor(String color) {
        this.color = color;
    }
    
    // Return filled. Since filled is a boolean, its getter method is named isFilled
    public boolean isFilled() {
        return filled;
    }
    
    // Set a new filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    // get dateCreated
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    
    // return a string representation of this object
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + 
                " and filled: " + filled;
    }
}
