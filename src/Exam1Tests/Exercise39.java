package Exam1Tests;

import java.util.Arrays;

public class Exercise39 {
    public static void main(String[] args) {
        int[] numbersArray = {6, 9, 4 , -9, 8, 12, 7, 9, 3};
        int number = 9;
        System.out.println(Arrays.toString(checkNumbersArrayFromParameters(numbersArray, number)));
    }

    private static int[] checkNumbersArrayFromParameters(int[] array, int number)
    {
        int[] resultArray = {0, 0, 0};

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < number)
            {
                resultArray[0]++;
            }
            else if (array[i] > number)
            {
                resultArray[2]++;
            }
            else
            {
                resultArray[1]++;
            }
        }

        return resultArray;
    }
}
