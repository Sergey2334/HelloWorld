package Exam1Tests;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        while (true)
        {
            System.out.println(isPrettyNumber());
        }
    }

    private static boolean isPrettyNumber()
    {
        Scanner input = new Scanner(System.in);
        boolean result = true;

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        String numberAsString = String.valueOf(Math.abs(number));

        if (numberAsString.charAt(0) != numberAsString.charAt(numberAsString.length() - 1))
        {
            result = false;
        }

        return result;
    }
}
