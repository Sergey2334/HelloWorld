package Lesson6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Total Students: ");
        int totalStudents = input.nextInt();

        System.out.println(getAverage(totalStudents));
    }

    public static boolean getAverage(int totalStudents)
    {
        Scanner input = new Scanner(System.in);

        float average = 0;
        for (int i = 0; i < totalStudents; i++)
        {
            System.out.printf("Enter student #%d Grade: ", i + 1);
            float tempGrade = input.nextFloat();
            average += tempGrade;
        }
        average /= totalStudents;

        return average > 60;
    }
}
