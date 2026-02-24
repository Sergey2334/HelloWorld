package Exam1Tests.Exercises.WebsiteExercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int itemsCount = 3;
        double sum = 0;

        for (int i = 0; i < itemsCount; i++)
        {
            System.out.print("Enter Item #" + (i + 1) + " Price: ");
            sum += input.nextInt();
        }

        if (sum > 500)
        {
            sum *= 0.9;
        }

        System.out.println("Sum: " + sum);
    }
}
