/**
 * 1211EC / Lab nr 3
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.Scanner;

public class Lab3Ex1 {
    public static void main(String[] args) {

        int count;
        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();

        int num1 = 0, num2 = 1;
        int i = 0;
        while (i < count) {
            System.out.print(num1 + " ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}

