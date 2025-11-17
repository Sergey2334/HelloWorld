package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first element (a1) : ");
        int a1 = input.nextInt();
        System.out.print("Enter Series Difference (d) : ");
        int d = input.nextInt();

        int n = 0;
        do
        {
            System.out.print("Enter A Valid Element Count (n >= 0) : ");
            n =  input.nextInt();
        }
        while (n < 0);

        for (int aN = a1, i = 1; i <= n; i++) // aN = Current Element
        {
            System.out.printf("a%d = %d\n", i, aN);
            aN += d;
        }
    }
}
