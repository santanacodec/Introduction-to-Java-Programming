/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 11.2 (The Person, Student, Employee, Faculty, and Staff classes) Design a class
 * named person and its two subclasses named Student and Employee. Make Faculty
 * and Staff subclasses of Employee. A person has a name, address, phone number, 
 * and email address. A student has a class status (freshman, sophomore, junior,
 * or senior). Define the status as a constant. An employee has an office, salary,
 * and date hired. Use the MyDate class defined in programming Exercise 10.14 to 
 * create an object for date hired. A faculty member has office hours and a rank.
 * A staff member has a title. Override the toString method in each class to display
 * the class name and the person's name.
 * 
 * Draw the UML diagram for the classes and implement them. Write a test program 
 * that creates a Person, Student, Employee, Faculty, and Staff, and invokes their
 * toString()methods.
 */
package person;

/**
 *
 * @author Edgar Santana
 */
public class Person {
    String name;
    String address;
    long phone;
    String email;
    
    public Person() {}
    
    public Person (String name, String address, long phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public long getPhone() {
        return phone;
    }
    
    public void setPhone(long phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone +
                "\nEmail: " + email;
    }
}
