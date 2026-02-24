package Exam1Tests.Exercises.WebsiteExercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 18)
        {
            System.out.println("You are a Minor");
        }

        else if (age > 65)
        {
            System.out.println("You are a Pensioner");
        }

        else
        {
            System.out.println("You are an Adult");
        }
    }
}
