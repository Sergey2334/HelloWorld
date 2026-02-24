package Exam1Tests.Exercises;

import java.util.Arrays;

public class Exercise40 {
    public static void main(String[] args) {
        int[] numbersArray1 = {4, 7, 12, 0, 1, 6};
        int[] numbersArray2 = {5, 71, 3, 4, 10, 12, 1};

        System.out.println(Arrays.toString(getIntersectionOf2Sets(numbersArray1, numbersArray2)));
    }

    // Has A Problem With Contains() , "1" is in "12" :'(
    private static int[] getIntersectionOf2Sets(int[] numberArray1, int[] numberArray2)
    {
        String intersectionStr = "";
        int sizeCount = 0;

        for (int i = 0; i < numberArray1.length; i++)
        {
            for (int j = 0; j < numberArray2.length; j++)
            {
                if (numberArray1[i] == numberArray2[j] && !intersectionStr.contains(String.valueOf(numberArray1[i])))
                {
                    sizeCount++;
                    intersectionStr += String.valueOf(numberArray1[i]) + "!";
                }
            }
        }

        int[] resultArray = new int[sizeCount];
        String[] subIntersectionStr = intersectionStr.split("!");

        if (sizeCount != 0)
        {
            for (int i = 0; i < resultArray.length; i++)
            {
                resultArray[i] = Integer.parseInt(subIntersectionStr[i]);
            }
        }

        return resultArray;
    }
}
