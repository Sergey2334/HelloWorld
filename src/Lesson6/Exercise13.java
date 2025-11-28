package Lesson6;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        System.out.printf("The Middle Digit is : %d", getMiddleDigit(getOddDigitCountNumber()));
    }

    public static boolean isOddDigitsCount(int number)
    {
        int count = 0;
        for (int i = 1; number / i != 0; i *= 10, count++);
        return count % 2 != 0;
    }

    public static int getOddDigitCountNumber()
    {
        Scanner input = new Scanner(System.in);

        int number = 10;
        do
        {
            System.out.print("Enter a Number with an Odd Amount of Digits: ");
            number = input.nextInt();
        }
        while (!isOddDigitsCount(number));

        return number;
    }

    public static int getMiddleDigit(int number)
    {
        int digitCount = 0;
        for (int i = 1; number / i != 0; i *= 10, digitCount++);
        int middleDigitSize = digitCount / 2;

        return (number % (int)(Math.pow(10, middleDigitSize + 1)) ) / (int)(Math.pow(10, middleDigitSize));
    }
}
