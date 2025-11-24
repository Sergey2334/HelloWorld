package Lesson5;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int limit = input.nextInt();

        for (int i = 1; i <= limit; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.printf("%d\t", j);
            }
            System.out.println();
        }
    }
}
