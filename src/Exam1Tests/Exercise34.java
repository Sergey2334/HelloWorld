package Exam1Tests;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int arraySize = input.nextInt();

        int[] numbersArray = new int[arraySize];

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        initializeNumbersArray(numbersArray, number);
        printNumbersArray(numbersArray);
    }

    private static void initializeNumbersArray(int[] numbersArray, int number)
    {
        for (int i  = 0; i < numbersArray.length; i++)
        {
            numbersArray[i] = number * (i + 1);
        }
    }

    private static void printNumbersArray(int[] numbersArray)
    {
        for (int i  = 0; i < numbersArray.length; i++)
        {
            System.out.println(numbersArray[i]);
        }

        System.out.println(Arrays.toString(numbersArray));
    }
}
