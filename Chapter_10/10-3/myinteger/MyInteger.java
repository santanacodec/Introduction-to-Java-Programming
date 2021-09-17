/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 10.3 (The MyInteger class) Design a class named MyInteger. The class contains:
 * 
 * - An int data field named value that stores the int value represented by this
 *   object.
 * - A constructor that creates a MyInteger object for the specified int value.
 * - A getter method that returns the int value.
 * - The methods isEven(), isOdd(), and isPrime() that return true if the value
 *   in this object is even, odd, or prime, respectively.
 * - The static methods isEven(int), isOdd(int), and isPrime(int) that return 
 *   true if the specifed value is even, odd, or prime, respectively.
 * - The static methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) 
 *   that return true if the specified value is even, odd, or prime respectively.
 * - The methods equals(int) and equals(MyInteger) that return true if the value 
 *   in this object is equal to the specified value.
 * - A static method parseInt(char[]) that converts an array of numeric characters 
 *   to an int value.
 * - A static method parseInt(String) that converts a string into an int value.
 * 
 * Draw the UML diagram for the class then implement the class. Write a client
 * program that tests all methods in the class.
 *
 */

package myinteger;

/**
 *
 * @author Edgar Santana
 */
public class MyInteger {

    /**
     * @param args the command line arguments
     */
    // int data field that stores the int value represented by this object
    private int value;
    
    // A constructor that creates a MyInteger object for the specified int value.
    public MyInteger(int value) {
        this.value = value;
    }
    
    // getter for int value.
    public int getValue() {
        return value;
    }
    
    public boolean isEven() {
        if (value % 2 == 0)
            return true;
        else
            return false;
    }
    
    public boolean isOdd() {
        if (value % 2 == 0)
            return false;
        else
            return true;
    }
    
    public boolean isPrime() {
        boolean flag = false;
        for (int i = 2; i <= value / 2; i++) {
            if ( value % i == 0 ) {
                flag = true; 
                break;
            }
        }
        if (!flag)
            return true;
        else
            return false;
    }
    
    public static boolean isEven(int sValue) {
        if (sValue % 2 == 0)
            return true;
        else
            return false;
    }
    
    public static boolean isOdd(int sValue) {
        if (sValue % 2 == 0)
            return false;
        else
            return true;
    }
    
    public static boolean isPrime(int sValue) {
        boolean flag = false;
        for (int i = 2; i <= sValue / 2; i++) {
            if ( sValue % i == 0 ) {
                flag = true; 
                break;
            }
        }
        if (!flag)
            return true;
        else
            return false;
    }
    
    public static boolean isEven(MyInteger mInt) {
        return mInt.isEven();
    }
    
    public static boolean isOdd(MyInteger mInt) {
        return mInt.isOdd();
    }
    
    public static boolean isPrime(MyInteger mInt) {
        return mInt.isPrime();
    }
    
    public boolean equals(int eValue) {
        if (eValue == value)
            return true;
        else
            return false;
    }
    
    public boolean equals(MyInteger mInt) {
        if (mInt.getValue() == value)
            return true;
        else
            return false;
    }    
    
    public static int parseInt(char[] c) {
        int newInt = Integer.parseInt(String.valueOf(c));
        return newInt;
    }
    
    public static int parseInt(String s) {
        int newInt = Integer.parseInt(s);
        return newInt;
    }
}
