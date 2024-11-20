/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 8.4 (Compute the weekly hours for each employee) Suppose the weekly hours for 
 * all employees are stored in a two-dimensional array. Each row records an employee's
 * seven-day work hours with seven columns. For example, the following array stores
 * the work hours for eight employees. Write a program that displays employees and
 * their total hours in increasing order of the total hours.
 */

package computetheweeklyhoursforeachemployee;

import java.util.Scanner;

/**
 *
 * @author Edgar Santana
 */
public class ComputeTheWeeklyHoursForEachEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] hours = getArray();        
        int[][] sum = new int[8][2];
        
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[0].length; j++) {
                sum[i][1] += hours[i][j];
            }
            sum[i][0] = i;
        }
        
        selectionSort(sum);
        
        for(int j = sum.length - 1; j >=0; j--) {
            System.out.println("Employee " + sum[j][0] + "'s total hours are: " +
                    sum[j][1]);
        }
    }
    
    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        
        int[][] m = new int[8][7];
        
        System.out.println("Enter " + m.length + " rows and " +
                m[0].length + " columns: ");
        
        for(int i = 0; i < m.length; i++)
            for(int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();
        return m;
    }
    
    public static void selectionSort(int[][] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int maxCol1 = list[i][1];
            int maxCol2 = list[i][0];
            int currentMaxIndex = i;
            
            for (int j = i + 1; j < list.length; j++) {
                if (maxCol1 < list[j][1]) {
                    maxCol1 = list[j][1];
                    maxCol2 = list[j][0];
                    currentMaxIndex = j;
                }
            }
            
            // Swap list[i] with listcurrentMinIndex] if necessary
            if (currentMaxIndex != i) {
                list[currentMaxIndex][1] = list[i][1];
                list[currentMaxIndex][0] = list[i][0];
                list[i][1] = maxCol1;
                list[i][0] = maxCol2;
            }
        }
        
    }
    
}
