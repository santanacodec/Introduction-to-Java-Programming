/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinteger;

/**
 *
 * @author Edgar Santana
 */
public class TestMyInteger {
    public static void main(String[] args) {
        // TODO code application logic here
        char[] arr = {'2','3','4','5'};
        MyInteger myInteger = new MyInteger(4);
        System.out.println(myInteger.isEven());
        System.out.println(myInteger.isOdd());
        System.out.println(myInteger.isPrime());
        System.out.println("-------------");
        System.out.println(myInteger.isEven(3));
        System.out.println(myInteger.isOdd(3));
        System.out.println(myInteger.isPrime(3));
        System.out.println("-------------");
        System.out.println(myInteger.isEven(myInteger));
        System.out.println(myInteger.isOdd(myInteger));
        System.out.println(myInteger.isPrime(myInteger));
        System.out.println("-------------");
        System.out.println(myInteger.equals(5));
        System.out.println(myInteger.equals(myInteger));
        System.out.println("-------------");
        MyInteger myInteger2 = new MyInteger(42);
        System.out.println(myInteger2.parseInt("5"));
        System.out.println(myInteger.parseInt(arr));    
    } 
}
