/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 8.3 (Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display
 * students in decreasing order of the number of correct answers.
 */

package sortstudentsongrades;

/**
 *
 * @author Edgar Santana
 */
public class SortStudentsOnGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Students' answers to the questions
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        
        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        
        int[][] result = new int[answers.length][2];
        
        // Grade All answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }
            result[i][0] = i;
            result[i][1] = correctCount;
            
            
        }
        selectionSort(result);
        
        for (int j = 0; j < result.length; j++) {
            System.out.println("Student " + result[j][0] + "'s correct count is " + 
                    result[j][1]);
        }
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
