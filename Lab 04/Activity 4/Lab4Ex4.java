/**
 * 1211EC / Lab nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.*;

public class Lab4Ex4 {
    public static void main(String[] args) {
        int[][] numbers = new int[5][6];
        Random rand = new Random();
    

        for (int i = 0; i < numbers.length; i++) {
          for (int j = 0; j < numbers[i].length; j++) {
            numbers[i][j] = rand.nextInt(101);
          }
        }
    

        for (int[] row : numbers) {
          System.out.println(Arrays.toString(row));
        }
    
        for (int i = 0; i < numbers.length; i++) {
          int rowSum = 0;
          for (int j = 0; j < numbers[i].length; j++) {
            rowSum += numbers[i][j];
          }
          System.out.println("Sum of elements in row " + (i + 1) + ": " + rowSum);
        }
    
        
        for (int j = 0; j < numbers[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < numbers.length; i++) {
              colSum += numbers[i][j];
            }
            System.out.println("Sum of elements in column " + (j + 1) + ": " + colSum);
        }
      }
    }
