package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenCount = 0;
        final int maxEvenCount = 5;

        while (evenCount < maxEvenCount) {
            System.out.print("Enter a number: ");
            if (isEven(input.nextInt()))
            {
                evenCount++;
            }
        }
    }

    private static boolean isEven(int num)
    {
        boolean result = true;
        if (num % 2 != 0)
        {
            result = false;
        }
        return result;
    }
}
