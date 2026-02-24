package Exam1Tests.Exercises;

import java.util.Arrays;

public class Exercise44 {
    public static void main(String[] args) {
        int[] numbersArray1 = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean left = true;
        int shifts = 3;

        System.out.println(Arrays.toString(shift(numbersArray1,left,shifts)));
    }

    private static int[] shift(int[] array, boolean left, int shifts)
    {
        int size = array.length;
        int[] resultArray = new int[size];

        int rightTurns = shifts;

        if (left)
        {
            rightTurns = size - (shifts % size);
        }

        for (int i = 0; i < size; i++)
        {
            int newIndex = (i + rightTurns) % size;
            resultArray[newIndex] = array[i];
        }

        return resultArray;
    }
}
