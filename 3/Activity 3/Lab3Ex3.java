/**
 * 1211EC / Lab nr 3
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab3Ex3 {
    public static void main(String[] args) {

        int[] a = {4, 2, 1, 0, 8, 3, 9, 6, 5 };
        int i, min = a[0], max = a[0];

        for (i = 0; i < a.length; i++)
        {
            if (min > a[i])
                min = a[i];
            if (max < a[i])
                max = a[i];
        }
        System.out.print("The minimum element is " + min);
        System.out.println(" and the maximum element is " + max);
    }
}