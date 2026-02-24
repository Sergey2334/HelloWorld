package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        while(true)
        {
            System.out.println(sumOfDigits());
        }
    }

    private static long sumOfDigits()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        number = Math.abs(number);
        int digitsCount = getDigitCount(number);

        long sum = 0;
        for (long i = 0, j = 10; i < digitsCount; i++, j *= 10)
        {
            sum += (number % j) / (j / 10);
        }

        return sum;
    }

    private static int getDigitCount(long number)
    {
        number = Math.abs(number);
        return ("" + number).length();
    }
}
