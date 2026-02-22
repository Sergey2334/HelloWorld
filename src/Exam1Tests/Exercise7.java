package Exam1Tests;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        System.out.println("The Unit Digit of the Number is: " + Math.abs(number % 10));
    }
}
