package Exam1Tests;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String exitFlag = " ";

        while (!exitFlag.equals("exit"))
        {
            int[] randomNumbersArray = getRandomArrayFromParameter(5);
            System.out.println(Arrays.toString(randomNumbersArray));
            exitFlag = input.nextLine();
        }
    }

    private static int[] getRandomArrayFromParameter(int sizeOfArray)
    {
        int[] randomArray = new int[sizeOfArray];
        Random random = new Random();

        for (int i = 0; i < sizeOfArray; i++)
        {
            randomArray[i] = random.nextInt(0 , 100);
        }

        return randomArray;
    }
}
