package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int numberCount = 4;

        double totalSum = 0;
        for(int i = 0; i < numberCount; i ++)
        {
            System.out.print("Enter Number #" + (i + 1) + ": ");
            totalSum += input.nextInt();
        }
        System.out.println("The Average is : " + (totalSum/numberCount));
    }
}
