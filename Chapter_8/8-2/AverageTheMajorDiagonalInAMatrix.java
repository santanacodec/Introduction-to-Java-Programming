/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 8.2 (Average the major diagonal in a matrix) Write a method that averages all 
 * the numbers in the major diagonal in an n * n matrix of double values using the 
 * following header:
 * 
 * public static double averageMajorDiagonal(double[][] m)
 * 
 * Write a test program that reads a 4-by-4 matrix and displays the average of all 
 * its elements on the major diagonal.
 */

package averagethemajordiagonalinamatrix;
import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class AverageTheMajorDiagonalInAMatrix {

    /**
     * @param args the command line arguments
     */
    public static double averageMajorDiagonal(double[][] m) {
        double average = 0;
        double sum = 0;
        for(int row = 0; row < m.length; row++) {
            sum += m[row][row];
            average = sum / 4;
        }
        return average;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double[][] m = new double[4][4];
        
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        System.out.println("Average of the elements in the major diagonal is " + 
                averageMajorDiagonal(m));
    }    
}
