package Exam1Tests;

import java.util.Arrays;

public class Exercise41 {
    public static void main(String[] args) {
        int[] numbersArray1 = {4, 7, 1, 0, 12, 6};
        int[] numbersArray2 = {5, 71, 3, 4, 10, 1, 12};

        System.out.println(Arrays.toString(getUnionOf2Sets(numbersArray1, numbersArray2)));
    }

    private static int[] getUnionOf2Sets(int[] numbersArray1, int[] numbersArray2)
    {
        int[] tempUnionOf2Sets = new int[numbersArray1.length + numbersArray2.length];
        int sizeCount = numbersArray1.length;

        for (int i = 0; i < numbersArray1.length; i++)
        {
            tempUnionOf2Sets[i] = numbersArray1[i];
        }

        for (int i = 0; i < numbersArray2.length; i++)
        {
            boolean isExist = false;
            for (int j = 0; j < numbersArray1.length; j++)
            {
                if (numbersArray2[i] == numbersArray1[j])
                {
                    isExist = true;
                    break;
                }
            }

            if (!isExist)
            {
                tempUnionOf2Sets[sizeCount] = numbersArray2[i];
                sizeCount++;
            }
        }

        int[] resultUnionOf2Sets = new int[sizeCount];

        for (int i = 0; i < sizeCount; i++)
        {
            resultUnionOf2Sets[i] = tempUnionOf2Sets[i];
        }

        return resultUnionOf2Sets;
    }
}
