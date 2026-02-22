package Exam1Tests;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 2 Digit Number: ");
        int number = input.nextInt();
        int unitDigit = number % 10;
        int tenDigit = (number % 100) / 10;
        System.out.println("Sum of Digits is: " + (unitDigit + tenDigit));
    }
}
