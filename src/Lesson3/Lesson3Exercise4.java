package Lesson3;

import java.util.Scanner;

public class Lesson3Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int adultAge = 18;

        System.out.print("Please enter your age : ");
        int age = input.nextInt();

        if(age >= adultAge)
        {
            System.out.println("You are an Adult");
        }
        else
        {
            System.out.println("You are not an Adult");
        }
    }
}
