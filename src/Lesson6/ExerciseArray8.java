package Lesson6;

public class ExerciseArray8 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 5, 12, -1, -120, 121, 10};
        int sum = maxOfArray(myArray);
        System.out.println(sum);
    }

    public static int maxOfArray(int[] array)
    {
        int maxElement = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > maxElement)
            {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}
