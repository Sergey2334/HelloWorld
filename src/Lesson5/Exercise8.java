package Lesson5;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int limit = input.nextInt();

        for (int i  = 1; i <= limit; i++)
        {
            for (int j = 0; j <= limit - i; j++)
            {
                System.out.printf("%d\t", j + 1);
            }
            System.out.println();
        }
    }
}
