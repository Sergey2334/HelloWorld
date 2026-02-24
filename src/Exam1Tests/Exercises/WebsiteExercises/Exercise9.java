package Exam1Tests.Exercises.WebsiteExercises;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fuel Capacity: ");
        double fuelCapacity = input.nextInt();
        System.out.print("Enter Current Fuel Left: ");
        double fuelLeft = input.nextInt();

        double fuelPercent = (fuelLeft / fuelCapacity) * 100;

        if (fuelPercent > 50)
        {
            System.out.println("No Need To Refuel");
        }

        else if (fuelPercent < 15)
        {
            System.out.println("Must Refuel !");
        }

        else
        {
            System.out.println("Recommended To Refuel");
        }
    }
}
