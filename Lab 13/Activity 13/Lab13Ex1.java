/**
 * 1211EC / Lab nr 13
 * @author Frimu Aurel-Viorel
 * @version 29/01/2023
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab13Ex1
{
    public static void main(String[] args)
    {
        Scanner in = null;
        PrintWriter out = null;
        try
        {
            in = new Scanner(new File("Lab13_test.txt"));
            int count = 0;
            while (in.hasNext())
            {
                in.next();
                count++;
            }
            in = new Scanner(new File("Lab13_test.txt"));
            String[] words = new String[count];
            count = 0;
            while (in.hasNext())
            {
                words[count++] = in.next();
            }
            int[] frequency = new int[words.length];
            for (int i = 0; i < words.length; i++)
            {
                frequency[i] = 1;
                for (int j = i + 1; j < words.length; j++)
                {
                    if (words[i].equals(words[j]))
                    {
                        frequency[i]++;
                        words[j] = "";
                    }
                }
            }
            for (int i = 0; i < words.length - 1; i++)
            {
                int minIndex = i;
                for (int j = i + 1; j < words.length; j++)
                {
                    if (words[j].compareTo(words[minIndex]) < 0)
                    {
                        minIndex = j;
                    }
                }
                if (minIndex != i)
                {
                    String temp = words[i];
                    words[i] = words[minIndex];
                    words[minIndex] = temp;
                    int tempInt = frequency[i];
                    frequency[i] = frequency[minIndex];
                    frequency[minIndex] = tempInt;
                }
            }
            out = new PrintWriter("Lab13_test_new.txt");
            for (int i = 0; i < words.length; i++)
            {
                if (!words[i].equals(""))
                {
                    out.println(words[i] + " " + frequency[i]);
                }
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
        finally
        {
            if (in != null)
            {
                in.close();
            }
            if (out != null)
            {
                out.close();
            }
        }
    }
}
