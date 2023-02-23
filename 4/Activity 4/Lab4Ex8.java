/**
 * 1211EC / Lab nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.*;

public class Lab4Ex8 {
    public static void main(String[] args) {
      
      int[] numbers = new int[10];
      Random rand = new Random();
  
      
      for (int i = 0; i < numbers.length; i++) {
        numbers[i] = rand.nextInt(101);
      }
  
      int maxDiff = 0;
      for (int i = 0; i < numbers.length - 1; i++) {
        int diff = Math.abs(numbers[i] - numbers[i + 1]);
        if (diff > maxDiff) {
          maxDiff = diff;
        }
      }
  
      System.out.println("Greatest difference between two successive numbers: " + maxDiff);
    }
  }