/**
 * 1211EC / Lab nr 5
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab5Ex4 {

    //iterative version
    public static int countChars(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
    
    /*
    //recursive version
    public static int countChars(String s, char c) {
        if (s.length() == 0) {
            return 0;
        }
        int count = countChars(s.substring(1), c);
        if (s.charAt(0) == c) {
            count++;
        }
        return count;
    }
    */
}