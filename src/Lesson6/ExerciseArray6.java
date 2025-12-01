package Lesson6;

public class ExerciseArray6 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 5, 12, -1, -120, 121, 10};
        int sum = sumOfArray(myArray);
        System.out.println(sum);
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        return sum;
    }
}
