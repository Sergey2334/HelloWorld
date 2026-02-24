package Exam1Tests.ExamExercises;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(numbersArray));
        System.out.println(Arrays.toString(shift1Right(numbersArray)));
        System.out.println(Arrays.toString(shiftRight(numbersArray, 3)));
        System.out.println(Arrays.toString(shiftLeftOrRight(numbersArray, 3, true)));
    }

    private static int[] shiftRight(int[] numbersArray, int shifts)
    {
        int size = numbersArray.length;
        int[] resultArray = new int[size];

        for (int i = 0; i < size; i++)
        {
            int newIndex = (i + shifts) % size;
            resultArray[newIndex] = numbersArray[i];
        }

        return resultArray;
    }

    private static int[] shiftLeftOrRight(int[] numbersArray, int shifts, boolean left)
    {
        int size = numbersArray.length;
        int[] resultArray = new int[size];

        for (int i = 0; i < size; i++)
        {
            int newIndex = (i + shifts) % size;

            if (left)
            {
                resultArray[i] = numbersArray[newIndex];
            }

            else
            {
                resultArray[newIndex] = numbersArray[i];
            }
        }

        return resultArray;
    }



    private static int[] shift1Right(int[] numberArray)
    {
        return shiftRight(numberArray, 1);
    }
}
