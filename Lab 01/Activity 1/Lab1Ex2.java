/**
 * 1211EC / Lab nr 1
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import javax.swing.*;

public class Lab1Ex2 {
    public static void main(String[] args) {

        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        System.out.println("The square of " + number + " is " + number * number);
        System.out.println("And the cube of " + number + " is " + number * number * number);
    }
}