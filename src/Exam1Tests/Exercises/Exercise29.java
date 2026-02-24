package Exam1Tests.Exercises;

public class Exercise29 {
    public static void main(String[] args) {
        int[] numsArray = {1,5,-10,22,1,30,24};

        System.out.println(getMaxFromArray(numsArray));
    }

    private static int getMaxFromArray(int[] numsArray)
    {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numsArray.length; i++)
        {
            if (numsArray[i] > max)
            {
                max = numsArray[i];
            }
        }

        return max;
    }
}
