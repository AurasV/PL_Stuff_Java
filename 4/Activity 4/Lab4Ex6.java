/**
 * 1211EC / Lab nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.*;

/**
 * Lab4Ex6
 */
public class Lab4Ex6 {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(101);
          }

        int count = 0;
        for (int number : numbers) {
        if (number % 2 == 1) {
                count++;
            }
        }
        System.out.println("Number of odd numbers: " + count);
    }
}