package Lesson6;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(isAverageSameAsNumber());
    }

    public static boolean isAverageSameAsNumber(){
        Scanner input = new Scanner(System.in);

        int numberAmount = 4;
        int[] myArray = new int[numberAmount];
        float sum = 0;
        for (int i = 0; i < numberAmount; i++)
        {
            System.out.printf("Enter #%d Number: ", i + 1);
            myArray[i] = input.nextInt();
            sum += myArray[i];
        }
        float average = sum / numberAmount;

        for (int i = 0; i < numberAmount; i++)
        {
            if(average == myArray[i])
            {
                return true;
            }
        }
        return false;
    }
}
