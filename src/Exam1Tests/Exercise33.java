package Exam1Tests;

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        int[] numbersArray = new int[10];

        initializeNumbersArray(numbersArray);

        printEvenNumbersFromArray(numbersArray);
    }

//    private static int[] createNumbersArray(int[] numbersArray)
//    {
//        Scanner input = new Scanner(System.in);
//        int[] newNumbersArray = new  int[numbersArray.length];
//
//        for (int i = 0; i < numbersArray.length; i++)
//        {
//            System.out.print("Enter number #" + (i + 1) + ": ");
//            newNumbersArray[i] = input.nextInt();
//        }
//
//        return newNumbersArray;
//    }

    private static void initializeNumbersArray(int[] numbersArray)
    {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbersArray.length; i++)
        {
            System.out.print("Enter number #" + (i + 1) + ": ");
            numbersArray[i] = input.nextInt();
        }
    }

    private static void printEvenNumbersFromArray(int[] numbersArray)
    {
        for (int i = 0; i < numbersArray.length; i++)
        {
            if (numbersArray[i] % 2 == 0)
            {
                System.out.println(numbersArray[i]);
            }
        }
    }
}
