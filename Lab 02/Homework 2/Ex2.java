/**
 * 1211EC / Homework nr 2
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import java.util.Scanner;
class Ex2
{
    public static void main(String args[])
    {
        //initialize the connection to the keyboard
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String aux = s;
        aux = aux.substring(0, 2).toLowerCase();
        int first = s.indexOf(" ");
        int second = s.indexOf(" ", first + 1);
        s = s.substring(second - 2, second);
        s = aux + s.toUpperCase();
        System.out.println(s);
    }
}
