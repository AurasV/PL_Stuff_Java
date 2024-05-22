/**
 * 1211EC / Lab nr 3
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.Scanner;

public class Lab3Ex2 {
    public static void main(String[] args) {

        int num1, num2;
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        int result = 1;

        for(int i = 1; i <= num1 && i <= num2; i++)
            if (num1 % i == 0 && num2 % i == 0)
                result = i;

        System.out.println(result);
    }
}