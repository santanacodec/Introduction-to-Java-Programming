/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 9.4 (Use the Random class) Write a program that creates a Random object with seed
 * 1000 and displays the first 50 random integers between 0 and 100 using the nextInt(100)
 * method.
 */
package random;
/**
 *
 * @author Edgar Santana
 */
public class Random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Random random = new java.util.Random(1000);
        
        for(int i = 1; i <= 50; i++) {           
            System.out.println(i + ": " + random.nextInt(100));
        }       
    }   
}
