/**
 * 1211EC / Lab nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.*;

public class Lab4Ex3 {
    public static void main(String[] args) {
        int[][] numbers = new int[5][6];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
              numbers[i][j] = random.nextInt(101);
            }
          }
      
          for (int[] row : numbers) {
            System.out.println(Arrays.toString(row));
          }
    }
}