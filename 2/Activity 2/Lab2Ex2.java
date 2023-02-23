import javax.swing.*;
public class Lab2Ex2 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        if (number % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
}