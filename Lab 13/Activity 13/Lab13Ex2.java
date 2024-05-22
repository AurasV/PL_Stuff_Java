/**
 * 1211EC / Lab nr 13
 * @author Frimu Aurel-Viorel
 * @version 29/01/2023
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;

public class Lab13Ex2
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        File inputFile = new File("Lab13_basicWordsinEnglish.txt");
        File outputFile = new File("Lab13_Shakespeare.txt");
        Scanner input = null;
        PrintWriter output = null;
        int wordsCount = 0;
        String[] words = null;
        try
        {
            input = new Scanner(inputFile);
            while (input.hasNextLine())
            {
                wordsCount++;
                input.nextLine();
            }
            input.close();
            words = new String[wordsCount];
            input = new Scanner(inputFile);
            for (int i = 0; i < wordsCount; i++)
            {
                words[i] = input.nextLine();
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + inputFile);
            System.exit(0);
        }
        finally
        {
            if (input != null)
            {
                input.close();
            }
        }
        try
        {
            output = new PrintWriter(outputFile);
            for (int i = 0; i < 10000; i++)
            {
                int randomIndex = rand.nextInt(wordsCount);
                output.print(words[randomIndex] + " ");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + outputFile);
            System.exit(0);
        }
        finally
        {
            if (output != null)
            {
                output.close();
            }
        }
    }
}
