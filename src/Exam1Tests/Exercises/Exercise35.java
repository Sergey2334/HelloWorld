package Exam1Tests.Exercises;

import java.util.Arrays;

public class Exercise35 {
    public static void main(String[] args) {
        int[] numbersArray = {105, 84, 52, 200, 190, 42};
        multiplyEvenNumbersArrayBy3(numbersArray);

        System.out.println(Arrays.toString(numbersArray));
    }

    private static void multiplyEvenNumbersArrayBy3(int[] numbersArray)
    {
        for (int i = 0; i < numbersArray.length; i += 2)
        {
            numbersArray[i] *= numbersArray[i] * 3;
        }
    }
}
