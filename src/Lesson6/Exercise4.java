package Lesson6;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        printNumbers(num);
    }

    public static void printNumbers(int inputtedNumber)
    {
        Random randValue = new Random();

        for (int i = 0; i < inputtedNumber; i++)
        {
            System.out.println(randValue.nextInt(0, inputtedNumber));
        }
    }
}
