package Lesson5;

public class Exercise14 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tempArray = getEvenNumbersFromArray(myArray);

        for (int i = 0; i < tempArray.length; i++)
        {
            System.out.println(tempArray[i]);
        }

    }

    public static int[] getEvenNumbersFromArray(int[] array)
    {
        int[] tempArray = new int[array.length];
        int evenCount = 0;

        for (int i = 0; i < array.length; i++)
        {
            if  (array[i] % 2 == 0)
            {
                tempArray[evenCount] = array[i];
                evenCount++;
            }
        }

        int[]  evenArray = new int[evenCount];
        for (int i = 0; i < evenCount; i++)
        {
            evenArray[i] = tempArray[i];
        }

        return evenArray;
    }
}
