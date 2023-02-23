/**
 * 1211EC / Lab nr 12
 * @author Frimu Aurel-Viorel
 * @version 29/01/2023
 */
import java.io.*;
import java.util.Scanner;

public class Lab12Ex1
{
    public static void main(String[] args)
    {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;
        double average;

        try
        {
            File file = new File("Lab12_numbers.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt())
            {
                int num = scanner.nextInt();
                count++;
                sum += num;
                if (num < smallest)
                {
                    smallest = num;
                }
                if (num > largest)
                {
                    largest = num;
                }
            }
            scanner.close();

            average = (double) sum / count;

            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
            System.out.println("Average: " + average);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}