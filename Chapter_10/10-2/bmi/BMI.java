/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 10.2(The BMI class) Add the following new constructor in the BMI class:
 * 
 * - Construct a BMI class with the specified name, age, weight, feel, and inches
 * 
 * public BMI(String name, int age, double weight, double feet, double inches)
 */
package bmi;

/**
 *
 * @author Edgar Santana
 */
public class BMI {
    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches
    private double feet;
    private double inches;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;
    
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }
    
    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }
    
    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND /
                ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }
    
    public double getBMIFeetInches() {
        double bmiFeetInches = (weight / 
                (((feet * 12) + inches) * ((feet * 12) + inches))) * 703;
        return Math.round(bmiFeetInches * 100) / 100.0;
    }
    
    public String getStatus() {
        double bmi = getBMI();
        double bmiFeetInches = getBMIFeetInches();
        if (bmi < 18.5 || bmiFeetInches < 18.5)
            return "Underweight";
        else if (bmi < 25 || bmiFeetInches < 25)
            return "Normal";
        else if (bmi < 30 || bmiFeetInches < 30)
            return "Overweight";
        else
            return "Obese";
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getFeet() {
        return feet;
    }
    
    public double getInches() {
        return inches;
    }
}