package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = input.nextInt();
        System.out.println("In 2040 you will be " + (age + (2040-2026)) + " Years Old");
    }
}
