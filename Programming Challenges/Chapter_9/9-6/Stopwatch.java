/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 9.6 (Stopwatch) Design a class named Stopwatch. The class contains:
 * - Private data fields startTime and endTime with getter methods.
 * - A no-arg constructor that initializes startTime with the current time.
 * - A method named start() that resets the startTime to the current time.
 * - A method named stop() that sets the endTime to the current time.
 * - A method named getElapsedTime() that returns the elapsed time for the stopwatch
 *   in milliseconds.
 * Draw the UML diagram for the class then implement the class. Write a test program
 * that measures the execution time of sorting 100000 numbers using selection sort.
 */
package stopwatch;
import java.util.Random;

/**
 *
 * @author Edgar Santana
 */
public class Stopwatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int[] numbers = new int[100000];
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        
        Stopwatch stopwatch = new Stopwatch();
        selectionSort(numbers);
        stopwatch.stop();
        
        System.out.println("Sorting 100,000 numbers took " + stopwatch.getElapsedTime() + " milliseconds");
    }
    
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]< arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    
    private long startTime;
    private long endTime;
    
    Stopwatch() {
        startTime = System.currentTimeMillis();
    }
    
    public long getStartTime() {
        return startTime;
    }
    
    public long getEndTime() {
        return endTime;
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime() {
        return endTime - startTime;
    }
}
