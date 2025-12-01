package Lesson6;

import java.util.Random;

public class ExerciseArray12 {
    public static void main(String[] args) {
        manipulateArray(10);
    }

    public static void manipulateArray(int size)
    {
        Random randVal = new Random();

        // Initialize array
        int[] array = new int[size];
        System.out.print("First Array :\t");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = randVal.nextInt(size * 10);
            System.out.printf("%d ", array[i]);
        }
        System.out.println();

        // Get count of each Element in tempArray
        int[] tempArray = new int[size];
        for (int i = 0; i < array.length; i++)
        {
            int count = 0;
            for (int j = 0; j < array.length; j++)
            {
                if (array[i] == array[j])
                {
                    count++;
                }
            }
            tempArray[i] = count;
        }

        // Check Popular Element
        int popularIndexVal = array[0];
        int popularIndex = 0;
        for (int i = 0; i < tempArray.length; i++)
        {
            if(tempArray[i] > popularIndexVal)
            {
                popularIndex = i;
            }
        }

        // Popular Element Count To Make New Array Size
        int tempNum = array[popularIndex];
        int tempCount = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (tempNum == array[i])
            {
                tempCount++;
            }
        }

        // All Elements Exactly Once
        if (tempCount <= 1)
        {
            tempCount = 0;
        }

        // Initialize New Array
        int[] newArray = new int[array.length -  tempCount];
        System.out.print("Second Array :\t");
        for (int i = 0; i < newArray.length; i++)
        {
            if (array[i] == array[popularIndex])
            {
                continue;
            }
            newArray[i] = array[i];
            System.out.printf("%d ", newArray[i]);
        }
        System.out.println();
    }
}
