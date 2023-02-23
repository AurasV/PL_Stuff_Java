/**
 * 1211EC / Lab nr 5
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab5Ex1 {
    public static boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

    public static void genPrimes(int n) {
    for (int i = 2; i < n; i++) {
        if (isPrime(i)) {
            System.out.print(i + " ");
        }
    }
    System.out.println();
}

    public static boolean allPrimeDivisors(int n) {
    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0 && !isPrime(i)) {
            return false;
        }
    }
    return true;
}

    //tester
    public static void main(String[] args) {
    genPrimes(100);
    }
}