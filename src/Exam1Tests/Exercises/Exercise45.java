package Exam1Tests.Exercises;

import java.util.Arrays;

public class Exercise45 {
    public static void main(String[] args) {
        int[] numbersArray = {4363,12756,1278,9550};

        System.out.println(Arrays.toString(countInstancesOfDigitsInNumbersArray(numbersArray)));
    }

    private static int[] countInstancesOfDigitsInNumbersArray(int[] numbers)
    {
        int[] digitsArray = new int[10]; // {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}

        for (int i = 0; i < numbers.length; i++)
        {
            int currentNumber = numbers[i];
            int numberSize = ("" + currentNumber).length();

            for (int j = 0, k = 10; j < numberSize; j++, k *= 10)
            {
                digitsArray[(currentNumber % k) / (k / 10)]++;
            }
        }

        return digitsArray;
    }
}
