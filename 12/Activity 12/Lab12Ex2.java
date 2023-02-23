/**
 * 1211EC / Lab nr 12
 * @author Frimu Aurel-Viorel
 * @version 29/01/2023
 */
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Lab12Ex2
{
    public static void main(String[] args)
    {
        int count = 0;
        int[] numbers = new int[100];

        try
        {
            File file = new File("Lab12_numbers.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt())
            {
                numbers[count++] = scanner.nextInt();
            }
            scanner.close();

            Arrays.sort(numbers, 0, count);

            FileWriter writer = new FileWriter("Lab12_numbers_new.txt");
            for (int i = 0; i < count; i++)
            {
                writer.write(numbers[i] + " ");
            }
            writer.close();

            System.out.println("Sorted");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch (IOException e)
        {
            System.out.println("Error writing to file");
        }
    }
}
