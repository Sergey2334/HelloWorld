package Exam1Tests;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter number1 :");
            int number1 = input.nextInt();
            System.out.print("Enter number2 :");
            int number2 = input.nextInt();
            System.out.println(gcd(number1, number2));
        }
    }

    private static int gcd(int number1, int number2)
    {
        int remainder = number1 % number2;
        if (remainder == 0)
        {
            return number2;
        }
        else
        {
            return gcd(number2, remainder);
        }
    }
}
