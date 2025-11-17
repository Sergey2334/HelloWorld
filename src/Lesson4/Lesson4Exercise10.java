package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int IntegerNumberCount = 0;

        while (IntegerNumberCount < 5)
        {
            System.out.print("Enter a Number : ");
            float num =  input.nextFloat();

            if (num % 1 == 0)
            {
                IntegerNumberCount++;
            }
        }
    }
}
