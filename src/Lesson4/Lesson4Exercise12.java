package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number Limit : ");
        int limit = input.nextInt();

        boolean hasSeven = false;
        boolean dividedBySeven = false;
        for (int i = 1; i <= limit; i++)
        {
            if (i % 7 == 0) // Check If Number Can Be Divided By 7
            {
                dividedBySeven = true;
            }

            for (int j = 1; j <= limit; j *= 10) // Checks If Number Has 7
            {
                if (i / j == 0 || dividedBySeven)
                {
                    break;
                }

                if (i % j == 7)
                {
                    hasSeven = true;
                    break;
                }
            }

            if (dividedBySeven || hasSeven)
            {
                System.out.println("BOOM !");
                dividedBySeven = false;
                hasSeven = false;
            }

            else
            {
                System.out.println(i);
            }
        }
    }
}
