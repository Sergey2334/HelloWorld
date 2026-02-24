package Exam1Tests.Exercises.WebsiteExercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int numbersCount = 3;
        int[] numbers = new int[numbersCount];

        for (int i = 0; i < numbersCount; i++)
        {
            System.out.print("Enter number " + (i + 1) + " : ");
            numbers[i] = input.nextInt();
        }

        if (Math.abs(numbers[2] - numbers[1]) != Math.abs(numbers[1] - numbers[0]))
        {
            System.out.println("Failure");
        }

        else
        {
            System.out.println("Success");
        }
    }
}
