/**
 * 1211EC / Lab nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.*;

public class Lab4Ex1 {
  public static void main(String[] args) {
   
    int[] numbers = new int[10];
    Random rand = new Random();

    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = rand.nextInt(101);
    }

    System.out.println("Array: " + Arrays.toString(numbers));

    int sum = 0;
    for (int number : numbers) {
      if (number % 3 == 0) {
        sum += number;
      }
    }
    System.out.println("Sum of elements divisible by 3: " + sum);
  }
}