package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = 0;
        int width = 0;

        do
        {
            System.out.print("Enter Length : ");
            length = input.nextInt();
        }
        while (length < 0);

        do
        {
            System.out.print("Enter Width : ");
            width = input.nextInt();
        }
        while (width < 0);

        for (int  i = 0; i < width; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 2; i < length; i++) // i = 2 , Because the top and bottom
        {
            System.out.print("*");
            for (int j = 0; j < (width - 2); j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int  i = 0; i < width; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
