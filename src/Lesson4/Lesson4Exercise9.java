package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int doubleDigitNumberCount = 0;

        while (doubleDigitNumberCount < 3)
        {
            System.out.print("Enter a Number : ");
            float num =  input.nextFloat();

            if ((int) num / 10 != 0 && (int) num / 100 == 0)
            {
                doubleDigitNumberCount++;
            }
        }
    }
}
