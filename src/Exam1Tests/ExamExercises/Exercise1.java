package Exam1Tests.ExamExercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String exitFlag = "";

        while (!exitFlag.equals("exit"))
        {
            System.out.print("Enter a size of array: ");
            int size = input.nextInt();

            System.out.println(Arrays.toString(createRandomBalancedArray(size)));

            exitFlag = input.nextLine();
        }
    }

    private static boolean isBalanced(int[] numbersArray)
    {
        boolean result = true;

        if (numbersArray.length != 0)
        {
            if (numbersArray.length % 2 != 0)
            {
                result = false;
            }

            int middleIndex = numbersArray.length / 2;

            if (numbersArray[middleIndex - 1] != numbersArray[middleIndex])
            {
                result = false;
            }

            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < numbersArray.length; i++)
            {
                if (i < middleIndex)
                {
                    leftSum += numbersArray[i];
                }
                else
                {
                    rightSum += numbersArray[i];
                }
            }

            if (leftSum != rightSum)
            {
                result = false;
            }
        }

        return result;
    }

    private static int[] createRandomBalancedArray(int size)
    {
        Random randomNumber = new Random();
        int[] resultArray= {1,2};
        int[] emptyArray = {};

        if (size % 2 == 0 && size > 0)
        {
            int[] tempArray = new int[size];

            while (!isBalanced(resultArray))
            {
                for (int i = 0; i < tempArray.length; i++)
                {
                    tempArray[i] = randomNumber.nextInt(10);
                }
                resultArray = tempArray;
            }
        }

        else
        {
            resultArray = emptyArray;
        }

        return resultArray;
    }
}
