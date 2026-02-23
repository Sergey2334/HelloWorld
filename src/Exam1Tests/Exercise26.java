package Exam1Tests;

import java.util.Arrays;

public class Exercise26 {
    public static void main(String[] args) {
        int[] numbers = getNumberArrayFromParameters(5, 3);
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] getNumberArrayFromParameters(int num1, int num2)
    {
        int[] numbers = new int[num1];

        for (int i = 0; i < num1; i++)
        {
            numbers[i] = num2;
        }

        return numbers;
    }
}
