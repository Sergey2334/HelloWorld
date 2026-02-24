package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter a Number: ");
            int number = input.nextInt();
            if (is2DigitNumber(number) && isDigitsAreTheSame(number))
            {
                break;
            }
        }

    }

    private static boolean is2DigitNumber(int num)
    {
        boolean result = true;
        if (num / 100 != 0 || num / 10 == 0)
        {
            result = false;
        }
        return result;
    }

    private  static boolean isDigitsAreTheSame(int num)
    {
        boolean result = true;
        if (num % 10 != (num % 100) / 10)
        {
            result = false;
        }
        return result;
    }
}
