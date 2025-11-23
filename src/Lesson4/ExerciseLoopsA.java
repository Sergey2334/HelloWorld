package Lesson4;

import java.util.Scanner;

public class ExerciseLoopsA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a1 = 0; //First Number in The Series
        int d = 0; //Distance between each number in the Series
        int n = 0; //Amount of Number in the Series

        System.out.print("Enter the First Number in the Series: ");
        a1 =  input.nextInt();
        System.out.print("Enter the Distance in the Series: ");
        d = input.nextInt();
        System.out.print("Enter the Amount of Numbers in the Series: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.printf("%d ", a1);
            a1 += d;
        }

    }
}
