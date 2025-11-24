package Lesson5;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        do
        {
            System.out.print("Enter a 2 digit Num: ");
            num = input.nextInt();
        }
        while (num / 100 != 0 || num / 10 == 0);

        for (int i = 0; i <= num; i++)
        {
            if (has5InNumber(i))
            {
                continue;
            }
            else
            {
                if (i == num)
                {
                    System.out.printf("%d\n", i);
                }
                else
                {
                    System.out.printf("%d , ", i);
                }
            }
        }
    }

    public static boolean has5InNumber(int num)
    {
        for (int i = 1; i <= num; i *= 10)
        {
            if (((num % (i * 10)) / i) == 5)
            {
                return true;
            }
        }
        return false;
    }
}
