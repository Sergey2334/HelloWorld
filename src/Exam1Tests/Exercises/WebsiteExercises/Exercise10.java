package Exam1Tests.Exercises.WebsiteExercises;

import java.util.Arrays;
import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        Random rand = new Random();
        final int numbersCount = 3;

        int[] numbersArray = new int[numbersCount];

        for (int i = 0; i < numbersCount; i++)
        {
            numbersArray[i] = rand.nextInt(1, 5);
        }


        System.out.println(Arrays.toString(numbersArray));

        if ((Math.abs(numbersArray[2] - numbersArray[1])) == (Math.abs(numbersArray[1] - numbersArray[0])))
        {
            System.out.println("Its A Mathematical Series :)");
        }

        else
        {
            System.out.println("Its Not A Mathematical Series :(");
        }
    }
}
