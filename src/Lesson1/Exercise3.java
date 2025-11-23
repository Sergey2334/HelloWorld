package Lesson1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = input.nextInt();

        if(num1 > num2)
        {
            System.out.printf("1st number : %d %nis Bigger than 2nd number : %d", num1 , num2);
        }
        else
        {
            System.out.printf("2nd number : %d %nis Bigger than 1st number : %d", num2 , num1);
        }
    }
}
