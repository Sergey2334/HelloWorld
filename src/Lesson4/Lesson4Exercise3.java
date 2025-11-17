package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startNum = 0;
        int endNum = 0;
        do
        {
            if (startNum > endNum)
            {
                System.out.println("End Number needs to be Bigger than Start Number !");
            }

            System.out.print("Enter a Start Number: ");
            startNum = input.nextInt();
            System.out.print("Enter a End Number: ");
            endNum = input.nextInt();
        }
        while (startNum > endNum);

        for (int i = startNum; i <= endNum; i++)
        {
            System.out.println(i);
        }
    }
}
