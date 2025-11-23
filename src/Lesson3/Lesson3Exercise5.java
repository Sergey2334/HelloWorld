package Lesson3;

import java.util.Scanner;

public class Lesson3Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int adultAge = 18;
        int oldAge = 65;

        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if(age >= oldAge)
        {
            System.out.println("You are a Pensioner");
        }
        else if (age >= adultAge)
        {
            System.out.println("You are and Adult");
        }
        else
        {
            System.out.println("You are a Minor");
        }
    }
}
