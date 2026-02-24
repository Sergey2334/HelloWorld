package Exam1Tests.Exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int costPerKM = 5;
        final double costTip = 1.1;

        System.out.print("Enter Object Price: ");
        double price = input.nextDouble();
        System.out.print("Enter Object Weight: ");
        double weight = input.nextDouble();
        System.out.print("Enter Distance From Store (In KM): ");
        double distFromStore = input.nextDouble();
        System.out.print("Enter Floor: ");
        int floor = input.nextInt();

        System.out.println("\nTotal Price is " + ((price) + (((distFromStore * costPerKM) + (floor * weight)) * costTip)));
    }
}
