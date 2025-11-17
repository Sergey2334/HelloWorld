package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correctNumberCount = 0;

        while (correctNumberCount < 3)
        {
            System.out.print("Enter a Number: ");
            int num =  input.nextInt();

            if (num / 1000 == 0 && num / 100 != 0) // Check if Triple Digit
            {
//                int firstDigit = num % 10;
//                int secondDigit = (num / 10) % 10;
//                int thirdDigit = (num / 100) % 10;

                if ((num % 10) == ((num / 10) % 10) && (num % 10) == ((num / 100) % 10)) // All 3 Digits are equal
                {
                correctNumberCount++;
                }
            }
        }
    }
}
