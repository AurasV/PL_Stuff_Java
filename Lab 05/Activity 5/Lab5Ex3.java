/**
 * 1211EC / Lab nr 5
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
public class Lab5Ex3 {

    public static int match(String s1, String s2) {
        int count = 0;
        int index = 0;
        while ((index = s2.indexOf(s1, index)) != -1) {
            count++;
            index += s1.length();
        }
        return count;
    }
}