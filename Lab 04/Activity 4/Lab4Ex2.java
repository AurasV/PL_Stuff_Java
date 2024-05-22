/**
 * 1211EC / Lab nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.*;
public class Lab4Ex2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
          }

        System.out.println("Original array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
