/**
 * 1211EC / Lab nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.*;

/**
 * Lab4Ex5
 */
public class Lab4Ex5 {

    public static void main(String[] args) {
        int[] numbers = new int[10];

 
    Random rand = new Random();

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rand.nextInt(101);
    }

    
    int max = numbers[0];
    for (int number : numbers) {
      if (number > max) {
        max = number;
      }
    }

    int min = numbers[0];
    for (int number : numbers) {
      if (number < min) {
        min = number;
      }
    }

    System.out.println("Maximum value: " + max);
    System.out.println("Minimum value: " + min);
  }
}