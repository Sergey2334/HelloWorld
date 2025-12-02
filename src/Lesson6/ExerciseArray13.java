package Lesson6;

public class ExerciseArray13 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 4, 25, 6, 7, 8, 9, -10};

        System.out.println(compareArrays(array1, array2));
    }

    public static int compareArrays(int[] arr1, int[] arr2)
    {
        int arr1Sum = 0;
        int arr2Sum = 0;

        for (int i = 0; i < arr1.length; i++)
        {
            arr1Sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++)
        {
            arr2Sum += arr2[i];
        }
        if (arr1Sum > arr2Sum)
        {
            return 1;
        }
        else if (arr1Sum < arr2Sum)
        {
            return 2;
        }
        return 0;
    }
}
