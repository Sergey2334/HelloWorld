package Lesson6;

public class ExerciseArray11 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 5, 12, -1, -120, 121, 10};
        int[] newArray = removeFromArray(myArray, -120);
        for (int i = 0; i < newArray.length; i++)
        {
            System.out.printf("%d ",  newArray[i]);
        }
    }

    public static int[] removeFromArray(int[] array, int number)
    {
        int count = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == number)
            {
                count++;;
            }
        }

        int[] tempArray = new int[array.length - count];
        for (int i = 0; i < tempArray.length; i++)
        {
            if (array[i] == number)
            {
                continue;
            }
            tempArray[i] = array[i];
        }
        return tempArray;
    }
}
