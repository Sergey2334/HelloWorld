package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your monthly Salary: ");
        int monthlySalary = input.nextInt();
        System.out.print("Enter your Sales Goal: ");
        int salesGoal = input.nextInt();
        System.out.print("Enter your Sales Achieved: ");
        int salesAchieved = input.nextInt();

        int salesPercent = (salesAchieved * 100) / salesGoal;

        int currentSalary = monthlySalary;
        if (salesPercent >= 100)
        {
            currentSalary = (int) (currentSalary * 1.75);
        }
        else if (salesPercent >= 50)
        {
            currentSalary = currentSalary + 2000;
        }

        System.out.println("Your Salary is: " + currentSalary);
    }
}
