/**
 * 1211EC / Lab nr 3
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.Scanner;
public class Lab3Ex4 {

    int binarySearch(int a[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (a[mid] == x)
                return mid;
            if (a[mid] > x)
                return binarySearch(a, l, mid - 1, x);
            return binarySearch(a, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {10, 17, 22, 31, 40, 48, 53, 59, 66, 75};
        int n = a.length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to search for: ");
        int x = scan.nextInt();
        Lab3Ex4 ob = new Lab3Ex4();
        int result = ob.binarySearch(a, 0, n - 1, x);
        if (result == -1)
            System.out.println("The element " + x + " was NOT found in the array.");
        else
            System.out.println("The element " + x + " was found at the index " + result);
    }
        
}