package Lesson6;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        System.out.println(isSeries(getArrayOf3()));
    }

    public static float[] getArrayOf3 ()
    {
        Scanner input = new Scanner(System.in);
        final int maxArraySize = 3;
        float[] array = new float[maxArraySize];

        for (int i = 0; i < maxArraySize; i++)
        {
            float temp = -1;
            do
            {
                System.out.printf("Enter a Positive Number #%d: ", i + 1);
                temp = input.nextFloat();
            }
            while (temp < 0);

            array[i] = temp;
        }

        return array;
    }

    public static boolean isSeries(float[] inputtedArray)
    {
        return inputtedArray[1] - inputtedArray[0] == inputtedArray[2] - inputtedArray[1];
    }
}
