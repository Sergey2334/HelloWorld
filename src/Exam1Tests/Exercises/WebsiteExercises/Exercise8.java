package Exam1Tests.Exercises.WebsiteExercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int numberCount = 3;
        int[] numbersArray = new int[numberCount];

        for (int i = 0; i < numberCount; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbersArray[i] = input.nextInt();
        }

        if (numbersArray[0] > numbersArray[1] && numbersArray[0] > numbersArray[2])
        {
            System.out.println("OK");
        }
    }
}
