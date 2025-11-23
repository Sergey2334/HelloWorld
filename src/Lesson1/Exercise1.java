package Lesson1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.print("Input first Number : ");
        num1 = input.nextInt();

        System.out.print("Input second Number : ");
        num2 = input.nextInt();

        float avg = (num1 + num2) / 2f;

        System.out.printf("The Average of Num1 : '%d' and Num2 '%d' is : %f", num1, num2, avg);
    }
}
