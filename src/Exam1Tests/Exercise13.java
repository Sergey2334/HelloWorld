package Exam1Tests;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Average: ");
        int average = input.nextInt();
        if (average > 90)
        {
            System.out.println("Excellent");
        }
        else if (average > 70)
        {
            System.out.println("Good");
        }
        else
        {
            System.out.println("Struggling");
        }
    }
}
