package Lesson6;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.printf("Max Number is : %.2f", getMax());
    }

    public static float getMax()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sequence of Numbers (Enter 0 to Exit): ");

        float maxNumber = -999999;
        float temp = 1;
        for (int i = 0; temp != 0; i++)
        {
            System.out.printf("Enter #%d Number: ", i + 1);
            temp = input.nextFloat();

            if (temp > maxNumber)
            {
                maxNumber = temp;
            }
        }
        return maxNumber;
    }
}
