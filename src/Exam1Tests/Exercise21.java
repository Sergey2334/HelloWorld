package Exam1Tests;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        while(true)
        {
            System.out.println(getDigitCount());

        }
    }

    private static int getDigitCount()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number =  Math.abs(input.nextLong());
        return ("" + number).length();
    }
}
