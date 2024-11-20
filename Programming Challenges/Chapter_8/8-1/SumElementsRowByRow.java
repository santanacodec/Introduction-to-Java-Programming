/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 8.1 (Sum elements row by row) Write a method that returns the sum of all the 
 * elements in a specified row in a matrix using the following header:
 * 
 * public static double sumRow(double[][] m, int rowIndex)
 * 
 * Write a test program that reads a 3-by-4 matrix and displays the sum of each
 * row.
 */

package sumelementsrowbyrow;

import java.util.Scanner;
/**
 *
 * @author Edgar Santana
 */
public class SumElementsRowByRow {

    /**
     * @param args the command line arguments
     */
    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0;
            for (int column = 0; column < m[rowIndex].length; column++) {
                sum += m[rowIndex][column];               
            }
        return sum;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        double[][] m = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        
        System.out.println("Sum of the elements at row 0 is " + sumRow(m, 0));
        System.out.println("Sum of the elements at row 1 is " + sumRow(m, 1));
        System.out.println("Sum of the elements at row 2 is " + sumRow(m, 2));
    }    
}
