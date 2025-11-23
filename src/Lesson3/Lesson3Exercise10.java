package Lesson3;

import java.util.Scanner;

public class Lesson3Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberCount = 3;
        System.out.printf("Please enter %d Numbers..%n",  numberCount);

        int numbers[] = new int[numberCount + 1]; //+1 for the next number in the Series

        for (int i = 0; i < numberCount; i++)
        {
            System.out.printf("Please enter number #%d : ", i + 1);
            numbers[i] = input.nextInt();
        }

        if ((Math.abs(numbers[0] - numbers[1]) == Math.abs(numbers[1] - numbers[2])) &&
                (numbers[0] != numbers[1]) && (numbers[1] != numbers[2]))
        {
            System.out.println("That's a Mathematical Series");
            int difference = numbers[0] - numbers[1];
            numbers[numberCount] = numbers[numberCount - 1] - difference;

            System.out.printf("Next Number in the Mathematical Series is : %d", numbers[numberCount]);
        }
    }
}
