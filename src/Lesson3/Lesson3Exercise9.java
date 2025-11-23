package Lesson3;

import java.util.Random;

public class Lesson3Exercise9 {
    public static void main(String[] args) {
        Random randomVal = new Random();

        int numberCount = 3;
        int minVal = 1;
        int maxVal = 5;
        int[] randomNumbers = new int[numberCount];

        for (int i = 0; i < numberCount; i++)
        {
            randomNumbers[i] = randomVal.nextInt(minVal, maxVal + 1);
            System.out.printf("Random Number #%d : %d%n",  i, randomNumbers[i]);
        }

        if ((randomNumbers[0] - randomNumbers[1] == randomNumbers[1] - randomNumbers[2]) &&
                (randomNumbers[0] != randomNumbers[1]) && (randomNumbers[1] != randomNumbers[2]))
        {
            System.out.println("That's a Mathematical Series");
        }
        else
        {
            System.out.println("That's not a Mathematical Series");
        }
    }
}
