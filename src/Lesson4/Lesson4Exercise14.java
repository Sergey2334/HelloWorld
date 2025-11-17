package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Lines Number : ");
        int lines =  input.nextInt();

        for (int i = 0; i < lines; i++)
        {
            for (int j = 0; j < lines; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
