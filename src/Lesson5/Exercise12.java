package Lesson5;

import java.util.Random;

public class Exercise12 {
    public static void main(String[] args) {

        int size = 10;
        int[] myArray = returnRandomArray(size);

        for(int i = 0; i < myArray.length; i++)
        {
            System.out.println(myArray[i]);
        }
    }

    public static int[] returnRandomArray(int size)
    {
        Random randomVal = new Random();
        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++)
        {
            myArray[i] = randomVal.nextInt(0 , size);
        }

        return myArray;
    }

}
