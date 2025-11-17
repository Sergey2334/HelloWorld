package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomVal = new Random();


        int numberCount = 5;
        int minValue = 0;
        int maxValue = 0;

        do
        {
            System.out.print("Please enter a Min Value: ");
            minValue = input.nextInt();
            System.out.print("Please enter a Max Value: ");
            maxValue = input.nextInt();
        }
        while (minValue > maxValue);

        int nums[] = new int[numberCount];

        System.out.println("The Numbers That Are Grater Than 10 :");

        for (int i = 0; i < numberCount; i++)
        {
            nums[i] = randomVal.nextInt(minValue, maxValue);
            if (nums[i] > 10)
            {
                System.out.printf("#%d Number : %d\n",  i + 1, nums[i]);
            }
        }



    }
}
