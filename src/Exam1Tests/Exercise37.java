package Exam1Tests;

public class Exercise37 {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int targetSumNumber = 7;

        System.out.println(getIndexOfNumber(numbersArray, targetSumNumber));
    }

    private static int getIndexOfNumber(int[] array, int number)
    {
        int index = -1;
        int sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];

            if (sum > number)
            {
                index = i;
                break;
            }
        }

        return index;
    }
}
