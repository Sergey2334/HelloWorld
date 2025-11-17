package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberCount;
        do
        {
            System.out.print("Enter Number Count : ");
            numberCount = input.nextInt();
        }
        while (numberCount <= 0);

        int nums[] = new int[numberCount];
        int sum = 0;

        for (int i = 0; i < numberCount; i++)
        {
            System.out.printf("Enter #%d Number : ", i + 1);
            nums[i] = input.nextInt();

            sum = sum + nums[i];
        }

        float average = (sum / numberCount);
        System.out.printf("The Average is : %.2f", average);
    }
}
