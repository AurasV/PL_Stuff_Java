/**
 * 1211EC / Lab nr 1
 * @author Frimu Aurel-Viorel
 * @version 20/01/2023
 */
import javax.swing.*;
import java.time.*;
import java.util.*;


public class Lab1Ex3 {
    public static void main(String[] args) {
        System.out.println("Enter your birthday in the format YYYY-MM-DD");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        LocalDate dob = LocalDate.parse(input);
        LocalDate now = LocalDate.now();
        Period period = Period.between(dob, now);

        System.out.printf("Your age in days is %d days.", period.getYears() * 365 + period.getMonths() * 30 + period.getDays());
    }
}