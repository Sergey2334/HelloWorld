package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Base Number : ");
        int base = input.nextInt();
        System.out.print("Enter Exponent : ");
        int exponent = input.nextInt();

        float product = base;
        if (exponent == 0)
        {
            product = 1;
        }

        else if (exponent < 0)
        {
            for (int i = 1; i < Math.abs(exponent); i++)
            {
                product *= base;
            }
            product = 1 / product;
        }

        else
        {
            for (int i = 1; i < exponent; i++)
            {
                product *= base;
            }
        }

        System.out.printf("Product = %.5f\n", product);
    }
}
