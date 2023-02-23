/**
 * 1211EC / Lab nr 5
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab5Ex5 {

    public static void modify(String s) {
        int mid = s.length() / 2;
        for (int i = 0; i < mid; i++) {
            System.out.print(s.charAt(i));
            if (i + mid < s.length()) {
                System.out.print(s.charAt(i + mid));
            }
        }
        System.out.println();
    }
        
    
    public static void main(String[] args) {
        modify("Hi there");
    }
}