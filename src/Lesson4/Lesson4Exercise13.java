package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;

        do
        {
            System.out.print("Enter A Number : ");
            thirdNum = input.nextInt();

            if ( Math.abs(thirdNum - secondNum) == Math.abs(secondNum - firstNum) ) // a3 - a2 == a2 - a1
            {
                if(firstNum < secondNum) // a1 != a2
                {
                    System.out.println("Series Detected :D");
                    break;
                }
            }

            firstNum = secondNum;
            secondNum = thirdNum;
        }
        while (true);
    }
}
