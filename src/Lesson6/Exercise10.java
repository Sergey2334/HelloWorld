package Lesson6;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A Number; ");
        int number = input.nextInt();
        printTable(number);
    }

    public static void printTable(int number)
    {
        for (int i = 1; i <= number; i++)
        {
            for (int j = 1; j <= number; j++)
            {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}
