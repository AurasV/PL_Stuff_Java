/**
 * 1211EC / Lab nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.*;

public class Lab4Ex7 {
  public static void main(String[] args) {
    int[] numbers = new int[10];
    Random rand = new Random();

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rand.nextInt(101);
    }

    int maxLength = 0;
    int length = 0;
    for (int number : numbers) {
      if (number % 2 == 0) {
        length++;
      } else {
        maxLength = Math.max(maxLength, length);
        length = 0;
      }
    }
    maxLength = Math.max(maxLength, length);

    System.out.println("Length of longest succession of even numbers: " + maxLength);
  }
}
