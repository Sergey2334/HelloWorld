package Exam1Tests;

import java.util.Arrays;

public class Exercise31 {
    public static void main(String[] args) {
        int[] numbersArray = {1, 5, 9, 5};
        int targetNumber = 5;

        int[] newNumbersArray = getNewNumbersArrayWithoutTargetNumber(numbersArray,targetNumber);
        System.out.println(Arrays.toString(newNumbersArray));
    }

    private static int[] getNewNumbersArrayWithoutTargetNumber(int[] numbersArray, int tagetNumber)
    {
        int count = 0;

        for (int i = 0; i < numbersArray.length; i++)
        {
            if (numbersArray[i] == tagetNumber)
            {
                count++;
            }
        }

        int[] newArray = new int[numbersArray.length - count];

        for (int i = 0, j = 0; i < numbersArray.length; i++)
        {
            if (numbersArray[i] != tagetNumber)
            {
                newArray[j++] = numbersArray[i];
                //j++;
            }
        }

        return newArray;
    }
}
