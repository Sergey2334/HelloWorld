package Exam1Tests;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Triangle First Side Length = ");
        double firstSideLength = input.nextDouble();
        System.out.print("Enter The Triangle Second Side Length = ");
        double secondSideLength = input.nextDouble();

        double hypotenuseLength = Math.sqrt((firstSideLength * firstSideLength) + (secondSideLength * secondSideLength));
        System.out.println("Hypotenuse Length is " + hypotenuseLength);
    }
}
