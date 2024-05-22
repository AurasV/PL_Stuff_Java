/**
 * 1211EC / Lab nr 5
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab5Ex6 {

    //iterative version
    public static boolean palindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    /*
    //recursive version
    public static boolean palindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return palindrome(s.substring(1, s.length() - 1));
    }
    */

    //tester
    public static void main(String[] args) {
        System.out.println(palindrome("racecar"));
        System.out.println(palindrome("racecars"));
    }
}