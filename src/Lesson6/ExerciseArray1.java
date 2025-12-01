package Lesson6;

public class ExerciseArray1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 12, 125, 2, 90, 100};
        printArray(array);
    }

    public static void printArray (int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            if (i == array.length - 1)
            {
                System.out.printf("%d",  array[i]);
            }
            else
            {
                System.out.printf("%d, ",  array[i]);
            }
        }
    }
}
