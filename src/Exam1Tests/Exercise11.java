package Exam1Tests;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int objectCount = 3;
        final int priceForDiscount = 500;

        double sum = 0;
        for(int i = 0; i < objectCount; i++)
        {
            System.out.print("Enter #" + (i + 1) +" Price: ");
            sum += input.nextDouble();
        }

        if (sum > priceForDiscount)
        {
            sum -= (sum * 0.1);
        }

        System.out.println("Total price is: " + sum);
    }
}
