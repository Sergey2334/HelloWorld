package Lesson6;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amount = input.nextInt();

        if (amount < 1)
        {
            System.out.println("Invalid Amount");
            return;
        }
        System.out.printf("Biggest Number : %d", getBiggest(amount));
    }

    public static int getBiggest(int amount)
    {
        Scanner input = new Scanner(System.in);

        int biggestNum = 0;
        for (int i = 0; i < amount; i++)
        {
            System.out.printf("Enter #%d Number: ", i + 1);
            int tempNum = input.nextInt();

            if(tempNum > biggestNum)
            {
                biggestNum = tempNum;
            }
        }
        return biggestNum;
    }
}
