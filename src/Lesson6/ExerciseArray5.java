package Lesson6;

public class ExerciseArray5 {
    public static void main(String[] args) {
        int[] myArray = getArray(5, 4);

        for (int i = 0; i < myArray.length; i++)
        {
            System.out.printf("%d ", myArray[i]);
        }
    }

    public static int[] getArray(int size, int num)
    {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i + num ;
        }
        return array;
    }
}
