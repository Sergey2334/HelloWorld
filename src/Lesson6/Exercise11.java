package Lesson6;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Digit: ");
        int digit = input.nextInt();
        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        System.out.println(isDigitInNumber(number, digit));
    }

    public static boolean is1Digit(int number)
    {
        if (number / 10 == 0)
        {
            return true;
        }
        return false;
    }

    public static boolean isDigitInNumber(int number, int inputtedDigit)
    {
        if(!is1Digit(inputtedDigit))
        {
            System.out.println("Invalid Digit !");
            return false;
        }

        inputtedDigit = Math.abs(inputtedDigit);
        for (int i = 1; number / i != 0; i *= 10)
        {
            int currentDigit = (number % (i * 10)) / (i);

            if (currentDigit == inputtedDigit)
            {
                return true;
            }
        }
        return false;
    }
}
