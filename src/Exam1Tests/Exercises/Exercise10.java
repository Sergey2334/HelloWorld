package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int minNumber = 1000;

        System.out.print("Please enter a number bigger than " + minNumber + ": ");
        int number = input.nextInt();

        if (number <= minNumber)
        {
            System.out.println("Failure");
        }
        else
        {
            System.out.println("Success");
        }
    }
}
