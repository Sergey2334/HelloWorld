package Exam1Tests.Exercises;

public class Exercise36 {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(isNumberArrayAnIncreasingOrder(numbersArray));
    }

    private static boolean isNumberArrayAnIncreasingOrder(int[] numbersArray)
    {
        boolean result = true;

        for (int i = 0; i < numbersArray.length - 1; i++)
        {
            if (numbersArray[i] > numbersArray[i + 1])
            {
                result = false;
            }
        }

        return result;
    }
}
