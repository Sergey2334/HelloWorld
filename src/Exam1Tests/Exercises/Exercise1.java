package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        double radius = input.nextDouble();

        System.out.printf("\nCircle Circumference: %f\n", 2 * Math.PI * radius);
        System.out.printf("Circle Area         : %f\n", Math.PI * radius * radius);
    }
}
