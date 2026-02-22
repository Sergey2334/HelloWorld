package Exam1Tests;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Two Digit Number: ");
        int number = input.nextInt();

        System.out.print("The Tens Digit is: " + (number % 100) / 10);
    }
}
