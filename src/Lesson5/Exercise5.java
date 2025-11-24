package Lesson5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int iterationCount = 10;
        final int ERROR_VAL = 999;

        int currentNumber = 0;
        int numberCount = 0;
        int sumOfNumbers = 0;

        for (int i = 0; i < iterationCount; i++)
        {
            System.out.printf("Enter #%d Number : ", numberCount + 1);
            currentNumber = input.nextInt();
            numberCount++;

            if (currentNumber == ERROR_VAL) // 999
            {
                break;
            }

            else if (currentNumber < 0) // Negative Value
            {
                continue;
            }

            else
            {
                sumOfNumbers += currentNumber;
            }
        }

        System.out.printf("Numbers Inputted : %d\nSum of Numbers : %d\n", numberCount, sumOfNumbers);
    }
}
