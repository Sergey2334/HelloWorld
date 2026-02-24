package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int maxNumberCount = 10;

        int divisibleBy3Count = 0;
        for (int i = 0; i < maxNumberCount; i++)
        {
            System.out.print("Enter a number: ");
            if (input.nextInt() % 3 == 0)
            {
                divisibleBy3Count++;
            }
        }
        System.out.println("Divisible By 3 Count: " + divisibleBy3Count);
    }
}
