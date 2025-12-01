package Lesson6;

public class ExerciseArray10 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 5, 2, -1, -120, 121, 10};
        int count = checkDigitsInArray(myArray, 2);
        System.out.println(count);
    }

    public static int checkDigitsInArray(int[] array, int num)
    {
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == num)
            {
                count++;
            }
        }
        return count;
    }
}
