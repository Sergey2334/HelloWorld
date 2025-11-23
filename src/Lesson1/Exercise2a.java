package Lesson1;

import java.util.Scanner;

public class Exercise2a {
    public static void main(String[] args) {
        int numberCount = 3;
        int[] numbers = new int[numberCount];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numberCount; i++){
            System.out.printf("Enter #%d number : ", i + 1);
            numbers[i] = input.nextInt();
        }

        int evenNumberCount = 0;
        for (int i = 0; i < numberCount; i++) {
            if(numbers[i] % 2 == 0)
            {
                evenNumberCount++;
            }
        }

        System.out.printf("Even Number Count : %d",  evenNumberCount);
    }
}
