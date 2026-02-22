package Exam1Tests;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numsArray = new int[3];

        for(int i = 0; i < numsArray.length; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            numsArray[i] = input.nextInt();
        }

        if(Math.abs(numsArray[2] - numsArray[1]) == Math.abs(numsArray[1] - numsArray[0]))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
