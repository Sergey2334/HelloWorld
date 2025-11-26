package Lesson5;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        /*
        idea:
        ___n/2-1___n/2___n/2+1___
           leftNum   +   rightNum = N

        Doesn't Work With Negative Numbers and Doesn't Work When N = 0 or 1 or Odd :'(
        */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        float N = input.nextFloat();

        int coupleCount = 0;
        for (int i = 1; i <= N / 2; i++)
        {
            float leftNum = (N / 2) - i;
            float rightNum = (N / 2) + i;
            System.out.printf("((n/2) - 1) = %.2f\t\t((n/2) + 1) = %.2f\n", leftNum, rightNum);
            coupleCount++;
        }
        System.out.printf("Couple Count = %d\n", coupleCount);
    }
}
