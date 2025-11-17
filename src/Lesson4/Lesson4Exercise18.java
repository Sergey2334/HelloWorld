package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lines = 0;
        do
        {
            System.out.print("Enter An Odd Number : ");
            lines = input.nextInt();
        }
        while (lines % 2 == 0);

        for (int i = 1; i <= lines; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = lines - 1; i >= 0; i--)
        {
            for (int j = i; j > 0; j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
