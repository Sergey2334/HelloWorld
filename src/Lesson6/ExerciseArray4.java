package Lesson6;

import java.util.Random;

public class ExerciseArray4 {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        fillArray(myArray, 5);
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.printf("%d ", myArray[i]);
        }

    }

    public static void fillArray(int[] array, int number)
    {
        Random randVal = new Random();
        for (int i = 0; i < array.length; i++)
        {
            array[i] = randVal.nextInt(number);
        }

    }
}
