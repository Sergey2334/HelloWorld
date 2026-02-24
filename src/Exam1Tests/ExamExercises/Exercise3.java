package Exam1Tests.ExamExercises;

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbersArray = {1, -1, 0, 41, 1, 20, 22, 15, 14, -45, 147, 12, 150, 54, 98, 420, 69, 23, -2410, 45, 420, 100};

        System.out.println(getMax(numbersArray));
        System.out.println(getSecondMax(numbersArray));
        System.out.println(getMaxExceptTarget(numbersArray, 150));
    }

    private static int getMax(int[] numbersArray)
    {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbersArray.length; i++)
        {
            if (max < numbersArray[i])
            {
                max = numbersArray[i];
            }
        }

        return max;
    }

    private static int getMaxExceptTarget(int[] numbersArray, int targetNum)
    {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbersArray.length; i++)
        {
            if ((max < numbersArray[i]) && (targetNum != numbersArray[i]))
            {
                max = numbersArray[i];
            }
        }

        return max;
    }

    private static int getSecondMax(int[] numbersArray)
    {
        return getMaxExceptTarget(numbersArray, getMax(numbersArray));
    }
}
