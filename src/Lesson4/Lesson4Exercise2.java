package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limit = 0;
        do
        {
            System.out.print("Please enter a positive integer: ");
            limit  = input.nextInt();
        }
        while(limit <= 0);

        for (int i = 0; i <= limit; i++)
        {
            System.out.println(i);
        }


    }
}
