package drawsquare;

import java.io.PrintStream;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int width = readData("width");
        int height = readData("height");

        if (testData(width, height))
        {
            drawSquare(width, height);
        }
    }

    static boolean testData(int width, int height)
    {
        boolean testResult = true;
        if ((width < 3) && (height < 3))
        {
            System.out.print("Input problem: data is not correct. Height and width must be greater or equal to 3.");
            testResult = false;
        }
        return testResult;
    }

    static int readData(String variable)
    {
        System.out.printf("Input the %s (%s >= 3) = ", variable, variable);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    static void drawSquare(int width, int height)
    {
        PrintStream out = System.out;
        for (int i = 0; i < height; i++)
        {
            if ((i == 0) || (i == height - 1))
            {
                out.print("*");
                for (int j = 0; j < width - 2; j++)
                {
                    out.print("-");
                }
                out.println("*");
            }
            else
            {
                out.print("|");
                for (int j = 0; j < width - 2; j++)
                {
                    out.print(" ");
                }
                out.println("|");
            }
        }
    }
}
