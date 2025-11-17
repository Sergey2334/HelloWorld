package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberCount = 5;
        int nums[] = new int[numberCount];

        for (int i = 0; i < numberCount; i++)
        {
            System.out.printf("Enter #%d Number : ", i + 1);
            nums[i] = input.nextInt();
        }

        System.out.println("The Even Numbers Are : ");

        for (int i = 0; i < numberCount; i++)
        {
            if (nums[i] % 2 == 0)
            {
                System.out.printf("%d ", nums[i]);
            }
        }
    }
}
