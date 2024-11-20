/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Edgar Santana
 */
public class Student extends Person {
     final String STATUS;
     
     public Student(final String STATUS) {
         this.STATUS = STATUS;
     }
     
     public final String getSTATUS() {
         return STATUS;
     }
     
     @Override
     public String toString() {
         return "You are a student that is a " + STATUS;
     }
}
