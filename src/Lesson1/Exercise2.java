package Lesson1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        int evenNumberCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Input first Number : ");
        num1 = input.nextInt();

        System.out.print("Input second Number : ");
        num2 = input.nextInt();

        System.out.print("Input third Number : ");
        num3 = input.nextInt();

        if(num1 % 2 == 0)
        {
            evenNumberCount++;
        }
        if(num2 % 2 == 0)
        {
            evenNumberCount++;
        }
        if(num3 % 2 == 0)
        {
            evenNumberCount++;
        }

        System.out.printf("Even Number Count : %d", evenNumberCount);
    }
}
