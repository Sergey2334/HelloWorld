package Lesson4;

import java.util.Scanner;

public class Lesson4Exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Lines Amount : ");
        int lines = input.nextInt();

        for (int i = 1; i <= lines; i++)
        {
            for  (int j = 0; j < i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
