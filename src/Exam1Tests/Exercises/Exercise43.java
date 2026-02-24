package Exam1Tests.Exercises;

import java.util.Arrays;

public class Exercise43 {
    public static void main(String[] args) {
        int[] numbersArray1 = {12,5,1,1,6,7,8,1,1,12,3};
        int[] numbersArray2 = {5,3,3,3,1,12,6,7,8};

        System.out.println(Arrays.toString(getAverageOf2NumbersArrays(numbersArray1, numbersArray2)));
    }

    private static double[] getAverageOf2NumbersArrays(int[] numbersArray1, int[] numbersArray2)
    {
        int maxSize = Math.max(numbersArray1.length, numbersArray2.length);

        int[] newNumbersArray1 = new int[maxSize];
        int[] newNumbersArray2 = new int[maxSize];

        for (int i = 0; i < numbersArray1.length; i++)
        {
            newNumbersArray1[i] = numbersArray1[i];
        }

        for (int i = 0; i < numbersArray2.length; i++)
        {
            newNumbersArray2[i] = numbersArray2[i];
        }

        double[] resultArray = new double[maxSize];

        for (int i = 0; i < resultArray.length; i++)
        {
            resultArray[i] = (double) (newNumbersArray1[i] + newNumbersArray2[i]) / 2;
        }

        return resultArray;
    }
}
