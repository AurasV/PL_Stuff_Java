/**
 * 1211EC / Lab nr 12
 * @author Frimu Aurel-Viorel
 * @version 29/01/2023
 */
import java.io.*;
import java.util.Scanner;

public class Lab12Ex3
{
    public static void main(String[] args)
    {
        int count = 0;
        String[] lines = new String[200];

        try
        {
            File file = new File("Lab12_test.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine())
            {
                lines [count++] = scanner.nextLine();
            }
            scanner.close();

            FileWriter writer = new FileWriter("Lab12_test_new.txt");
            for (int i = count - 1; i >= 0; i--)
            {
                writer.write(lines[i] + System.lineSeparator());
            }
            writer.close();

            System.out.println("Done");
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
