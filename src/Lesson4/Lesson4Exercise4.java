package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberCount = 5;

        int nums[] = new int[numberCount];

        for (int i = 0; i < numberCount; i++)
        {
            System.out.printf("Please enter #%d Number : ", i + 1);
            nums[i] = input.nextInt();
        }

        System.out.println("The Numbers That Are Greater Then 10");

        for (int i = 0; i < numberCount; i++)
        {
            if (nums[i] > 10)
            {
                System.out.printf("#%d Number : %d\n",  i + 1, nums[i]);
            }
        }
    }
}
