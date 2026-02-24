package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 2 Digit Number: ");
        int number =  input.nextInt();

        if (is2Digit(number))
        {
            System.out.println("The Sum of Digits is: " + sumOfDigits(number));
        }
    }

    private static boolean is2Digit(int number)
    {
        boolean result = true;
        if ((number / 100) != 0 || (number / 10) == 0)
        {
            result = false;
        }
        return result;
    }

    private static int sumOfDigits(int number)
    {
        int digitCount = ("" + Math.abs(number)).length();

        int sum = 0;
        for (int i = 0, j = 10; i < digitCount; i++, j *= 10)
        {
            sum += (Math.abs(number) % j) / (j / 10);
        }
        return sum;
    }
}
