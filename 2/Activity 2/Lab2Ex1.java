import javax.swing.*;
public class Lab2Ex1 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        if (number >= 0)
            System.out.println("The number is positive");
        else
            System.out.println("The number is negative");
    }
}