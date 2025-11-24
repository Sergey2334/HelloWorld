package Lesson5;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minVal = 0;
        int maxVal = 100;
        int number = -1;
        do
        {
            System.out.print("Enter a Number in range of 0 to 100 : ");
            number = input.nextInt();
        }
        while (number < 0 || number > 100);

        System.out.printf("The Number: %d", number);
    }
}
