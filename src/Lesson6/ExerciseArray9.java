package Lesson6;

import java.util.Random;

public class ExerciseArray9 {
    public static void main(String[] args) {
        int max = manipulateArray(5);
        System.out.printf("\nMax Value : %d\n", max);
    }

    public static int manipulateArray(int size)
    {
        Random randVal = new Random();
        final int MAX_BOUND = 100;

        int[] array = new int[size];
        int maxValue = 0;
        for (int i = 0; i < array.length; i++)
        {
            array[i] = randVal.nextInt(MAX_BOUND);
            if  (array[i] > maxValue)
            {
                maxValue = array[i];
            }
            System.out.printf("[%d] = %d\n", i, array[i]);
        }
        return maxValue;
    }
}
