package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Height: ");
        int height = input.nextInt();
        System.out.print("Enter Width: ");
        int width = input.nextInt();

        System.out.println("Circumference = " + ((2 * height) + (2 * width)));
        System.out.println("Area          = " + (height * width));
    }
}
