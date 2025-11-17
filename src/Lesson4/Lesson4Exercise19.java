package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lineAmount = 0;
        do
        {
            System.out.print("Enter And Odd Line Amount : ");
            lineAmount = input.nextInt();
        }
        while (lineAmount % 2 == 0);

        for  (int i = 1; i <= lineAmount; i++)
        {
            if (i % 2 != 0)
            {
                for (int k = i / 2; k < lineAmount / 2; k++)
                {
                    System.out.print(" ");
                }

                for (int j = 0; j < i; j++)
                {
                    System.out.print(i);
                }

                System.out.println();
            }
        }

        for  (int i = lineAmount - 1; i >= 0; i--)
        {
            if (i % 2 != 0)
            {
                for (int k = i / 2; k < lineAmount / 2; k++)
                {
                    System.out.print(" ");
                }

                for (int j = 0; j < i; j++)
                {
                    System.out.print(i);
                }

                System.out.println();
            }
        }
    }
}
