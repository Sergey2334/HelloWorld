package Lesson3;

import java.util.Scanner;

public class Lesson3Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int discountFromPrice = 500;
        int itemCount = 3;
        float currentItemPrice = 0;
        float totalPrice = 0;

        System.out.println("Please enter the 3 Prices..");

        for(int i = 0; i < itemCount; i++)
        {
            System.out.printf("Item Number %d#: ", i + 1);
            currentItemPrice = input.nextFloat();
            totalPrice += currentItemPrice;
        }

        if (totalPrice >= discountFromPrice)
        {
            totalPrice = totalPrice*  (0.9f);
            System.out.printf("Total price (after discount) is %f", totalPrice);
        }
        else
        {
            System.out.printf("Total price is %f", totalPrice);
        }


    }
}
