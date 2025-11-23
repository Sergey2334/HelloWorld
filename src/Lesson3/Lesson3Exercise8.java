package Lesson3;

import java.util.Scanner;

public class Lesson3Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float currentFuelValue = 0f;
        float fullFuelValue = 0f;

        System.out.print("Please enter your Full fuel tank value : ");
        fullFuelValue = input.nextFloat();
        System.out.print("Please enter your Current fuel tank value : ");
        currentFuelValue = input.nextFloat();

        float noNeedToRefuelValue = fullFuelValue * 0.50f; //50% of Full Fuel Tank
        float recommendedToRefuelValue = fullFuelValue * 0.15f; // 15% of Full Fuel Tank

        if(currentFuelValue > noNeedToRefuelValue)
        {
            System.out.println("No Need To Refuel");
        } else if (currentFuelValue >= recommendedToRefuelValue)
        {
            System.out.println("Recommended To Refuel");
        }
        else
        {
            System.out.println("You Have to Refuel !");
        }
    }
}
