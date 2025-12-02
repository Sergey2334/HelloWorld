package Lesson6;

public class ExerciseArray15 {
    public static void main(String[] args) {
        int[] myArray1 = {1, 2, 3, 4, 25, 6, 7, 8, 9, -10, 120};
        int[] myArray2 = {1, 2, 3, 4, 25, 6, 25, 4, 3, 2, 1};
        System.out.println(isArrayPalindrome(myArray2));
    }

    public static boolean isArrayPalindrome (int[] array)
    {
        int arrayLength = array.length;

        int[] oppositeArray = new int[arrayLength]; // Array1 [i] = Array2[length - i]
        for (int i = 0; i < arrayLength; i++)
        {
            oppositeArray[i] = array[arrayLength - 1 - i];
            //System.out.printf("Array1[%d] = %d\n",  i + 1, array[i]);
            //System.out.printf("Array2[%d] = %d\n",  i + 1, oppositeArray[i]);
        }

        for (int i = 0; i < arrayLength; i++)
        {
            if(array[i] != oppositeArray[i])
            {
                return false;
            }
        }
        return true;
    }
}
