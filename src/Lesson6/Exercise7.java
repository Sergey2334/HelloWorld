package Lesson6;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = input.nextInt();

        printRandomNumbers(number);
    }

    public static void printRandomNumbers(int number)
    {
        Random randVal = new Random();

        for (int i = 0; i < number; i++)
        {
            int temp = randVal.nextInt();
            if (temp % number == 0)
            {
                System.out.println(temp);
            }
        }
    }
}
