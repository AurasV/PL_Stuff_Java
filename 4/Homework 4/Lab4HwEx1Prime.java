/**
 * 1211EC / Homework nr 4
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab4HwEx1Prime {
    public static boolean isPrime(int nr) {
      if (nr < 2) {
        return false;
      }
      for (int i = 2; i <= Math.sqrt(nr); i++) {
        if (nr % i == 0) {
          return false;
        }
      }

      return true;
    }
    
    //test
    public static void main(String[] args){
        int nr = 0;
        int count = 0;
        while (count < 100) {
            if (isPrime(nr)) {
            System.out.print(nr + " ");
            count++;
            if (count % 10 == 0) {
                System.out.println();
            }
            }
            nr++;
        }
    }
  }
  