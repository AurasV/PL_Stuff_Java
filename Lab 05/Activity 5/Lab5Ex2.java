/**
 * 1211EC / Lab nr 5
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab5Ex2 {

    public static boolean isPerfect(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }
        }
        return sum == x;
    }

    //tester
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}