package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3 Digit Number: ");
        int number  = input.nextInt();

        if (is3Digit(number))
        {
            if (isSeries(number))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }

        System.out.println("________");
        System.out.println("---V2---");
        System.out.println("________");

        if (is3DigitV2(number))
        {
            if (isSeriesV2(number, 3))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }

    }

    private static boolean is3Digit(int number)
    {
        boolean result = true;
        if ((number / 1000) != 0 || (number / 100) == 0)
        {
            result = false;
        }
        return result;
    }

    private static boolean is3DigitV2(int number)
    {
        boolean result = true;
        if (("" + Math.abs(number)).length() != 3)
        {
            result = false;
        }
        return result;
    }

    private static boolean isSeries(int number)
    {
        boolean result = true;
        number = Math.abs(number);
        if (( (number % 1000) / 100) - ((number % 100) / 10) != ((number % 100) / 10) - ((number % 10)))
        {
            result = false;
        }
        return result;
    }

    private static boolean isSeriesV2(int number, int digitCount)
    {
        boolean result = true;
        number = Math.abs(number);
        int[] digitsArray = new int[digitCount];
        for (int i = 0; i < digitCount; i++)
        {
            digitsArray[i] =  (int) ("" + number).charAt(i);
        }

        for (int i = 1; i < digitCount - 1; i++)
        {
            if (digitsArray[i + 1] - digitsArray[i] != digitsArray[i] - digitsArray[i - 1])
            {
                result = false;
                break;
            }
        }

        return result;
    }
}
