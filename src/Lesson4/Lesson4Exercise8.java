package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenCount = 0;
        do
        {
            System.out.print("Enter a Number : ");
            int num = input.nextInt();

            if (num % 2 == 0)
            {
                evenCount++;
            }
        }
        while (evenCount < 5);
    }
}
