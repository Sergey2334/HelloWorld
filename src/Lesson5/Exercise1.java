package Lesson5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        do
        {
            System.out.print("Enter a positive integer: ");
            num = input.nextInt();
        }
        while (num <= 0);

        System.out.printf("The number : %d", num);
    }
}
