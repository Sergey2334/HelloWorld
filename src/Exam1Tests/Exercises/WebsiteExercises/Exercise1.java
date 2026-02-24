package Exam1Tests.Exercises.WebsiteExercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number bigger that 1000; ");
        int number = input.nextInt();

        if (number > 1000)
        {
            System.out.println("Success");
        }

        else
        {
            System.out.println("Failure");
        }
    }
}
