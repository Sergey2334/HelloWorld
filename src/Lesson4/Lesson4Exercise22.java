package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N : "); // n! = 1*2*3*...*n (Factorial) , Only Positive Integers => n >= 0
        int n = input.nextInt();

        int product = 1;
        for (int i = 1; i <= n; i++)
        {
            product *= i;
        }
        System.out.printf("n! : %d! = %d ", n, product);
    }
}
