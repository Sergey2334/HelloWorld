package Exam1Tests;

import java.util.Arrays;

public class Exercise27 {
    public static void main(String[] args) {
        int[] numbers = getNumberArrayFromParameters(6, 2);
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] getNumberArrayFromParameters(int num1, int num2)
    {
        int[] numbers = new int[num1];

        for (int i = 0; i < num1; i++)
        {
            numbers[i] = num2 + i;
        }

        return numbers;
    }
}
