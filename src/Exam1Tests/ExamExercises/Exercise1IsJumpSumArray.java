package Exam1Tests.ExamExercises;

public class Exercise1IsJumpSumArray {
    public static void main(String[] args) {
        int[] array1 = {5};
        int[] array2 = {5, 6};
        int[] array3 = {5, 6, 8, 11, 15};
        int[] array4 = {15, 11, 8, 6, 5};
        int[] array5 = {8, 6, 5};
        System.out.println(isJumpSumArray(array1));
        System.out.println(isJumpSumArray(array2));
        System.out.println(isJumpSumArray(array3));
        System.out.println(isJumpSumArray(array4));
        System.out.println(isJumpSumArray(array5));
    }

    public static boolean isJumpSumArray(int[] array)
    {
        boolean result = true;

        if (array.length >= 2)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                int currentNum = array[i];

                if (array[i + 1] != currentNum + i + 1) // Forgot To Put "+ 1" Near The "i" :'(
                {
                    result = false;
                    break; // Forgot To Put Break :'(
                }
            }
        }
        return result;
    }
}
