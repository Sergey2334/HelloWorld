package Lesson1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int sum = (num1 % 10) + ( (num2 % 100) / 10);
        System.out.printf("Sum of Num1 first digit and Num2 second digit : %d%n", sum);
    }
}
