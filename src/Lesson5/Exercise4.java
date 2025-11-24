package Lesson5;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        do
        {
            System.out.print("Enter a 3 digit Number: ");
            num = input.nextInt();
        }
        while (num / 1000 != 0 || num / 100 == 0);

        boolean first9Divided = false;
        for (int i = 0; i <= num; i++)
        {
            if (i % 9 == 0 && !first9Divided)
            {
                first9Divided = true;
                System.out.printf("%d\n", i);
            }

            if (i % 4 == 0)
            {
                if (i % 3 != 0)
                {
                    System.out.printf("%d\n", i);
                }
            }
        }
    }
}
