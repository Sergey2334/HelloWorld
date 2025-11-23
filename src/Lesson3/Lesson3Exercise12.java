package Lesson3;

import java.util.Scanner;

public class Lesson3Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a three digit number : ");
        int numberInputted = input.nextInt();

        if (numberInputted < 1000 &&  numberInputted > 99)
        {
            int firstNum =  numberInputted / 100;
            int secondNum = (numberInputted % 100) / 10;
            int thirdNum = numberInputted % 10;

            if ((firstNum - secondNum == secondNum - thirdNum) && (firstNum != secondNum || secondNum != thirdNum))
            {
                System.out.println("Success !");
            }
            else
            {
                System.out.println("Fail !");
            }
        }
    }
}
