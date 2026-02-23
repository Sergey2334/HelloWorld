package Exam1Tests;

public class Exercise42 {
    public static void main(String[] args) {
        int[] numbersArray1 = {12,5,1,1,6,7,8,1,1,12,3};
        int[] numbersArray2 = {5,3,3,3,1,12,6,7,8};

        System.out.println(equalValuesArrays(numbersArray1, numbersArray2));
    }

    private static boolean equalValuesArrays(int[] numbers1,  int[] numbers2)
    {
        boolean result = false;

        for (int i = 0; i < numbers1.length; i++)
        {
            result = false;

            for (int j = 0; j < numbers2.length; j++)
            {
                if (numbers1[i] == numbers2[j])
                {
                    result = true;
                }
            }

            if (!result)
            {
                break;
            }
        }

        return result;
    }
}
