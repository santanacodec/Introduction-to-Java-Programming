/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoint;

/**
 *
 * @author Edgar Santana
 */
public class TestMyPoint {
    public static void main(String[] args) {
        // TODO code application logic here
        // Specified my point object
        MyPoint point = new MyPoint(10, 30.5);       
        System.out.println(point.distance());
        System.out.println("----------");
        
        // my point object with 0, 0 argument
        MyPoint point2 = new MyPoint();
        System.out.println(point2.distance(10, 30.5));
        System.out.println("----------");
        
        System.out.println(point.distance(point, point2));
    }     
}
