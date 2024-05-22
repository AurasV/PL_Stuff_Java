/**
 * 1211EC / Lab nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.*;

public class Lab4Ex9 {
    public static void main(String[] args) {
     
      int[][] numbers = new int[5][5];
  
   
      int value = 1;
      int row = 0;
      int col = 0;
      int direction = 0;
      int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // directions: right, down, left, up
      while (value <= 25) {
        numbers[row][col] = value;
        int nextRow = row + dirs[direction][0];
        int nextCol = col + dirs[direction][1];
        if (nextRow < 0 || nextRow >= 5 || nextCol < 0 || nextCol >= 5 || numbers[nextRow][nextCol] != 0) {
          direction = (direction + 1) % 4;
          nextRow = row + dirs[direction][0];
          nextCol = col + dirs[direction][1];
        }
        row = nextRow;
        col = nextCol;
        value++;
      }
  
      for (int[] rows : numbers) {
        System.out.println(Arrays.toString(rows));
      }
    }
  }
  