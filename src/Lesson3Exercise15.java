import java.util.Random;
import java.util.Scanner;

public class Lesson3Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomVal = new Random();

        int fullPlanePassengersAmount = 0;
        int currentPlanePassengersAmount = 0;

        int flightDistance = 0;
        int flightRangeInKM = 100;

        float closeFlightCostPerKM = 2f;
        float midFlightCostPerKM = 1.5f;
        float farFlightCostPerKM = 1.2f;

        boolean isStorm = false;

        float ticketCost = 0;

        System.out.println("+=================================================================================+");
        System.out.println("\tWelcome to Flyin’ Hawaiian! - Perfect for flights heading to tropical islands");
        System.out.println("+=================================================================================+");



        System.out.println("\n+=================================================================================+");
        System.out.println("We need you to fill up a few things first..\n");

        System.out.print("Flight Distance (In km) : ");
        flightDistance = input.nextInt();
        System.out.print("Full Plane Passengers Amount: ");
        fullPlanePassengersAmount = input.nextInt();
        System.out.print("Current Plane Passengers: ");
        currentPlanePassengersAmount = input.nextInt();
        System.out.println("+=================================================================================+");


        System.out.println("+=================================================================================+");
        System.out.println("Ticket price details: ");

        int flightDistanceRemaining = flightDistance;
        float tempPriceCheck = 0;

        if (flightDistanceRemaining > flightRangeInKM) //More than 100KM
        {
            tempPriceCheck = (flightRangeInKM * closeFlightCostPerKM);

            System.out.printf("First 100KM (0 - 100 KM) Cost is %.2f per KM, and you travel %d in that range ", closeFlightCostPerKM, flightRangeInKM);
            System.out.printf("There for : \t+%.2f$\n", tempPriceCheck);

            ticketCost += tempPriceCheck;
            flightDistanceRemaining -= flightRangeInKM;


            if (flightDistanceRemaining > flightRangeInKM) //More than 200KM
            {
                tempPriceCheck = (flightRangeInKM * midFlightCostPerKM);

                System.out.printf("Second 100KM (101 - 200 KM) Cost is %.2f per KM, and you travel %d in that range ", midFlightCostPerKM, flightRangeInKM);
                System.out.printf("There for : \t+%.2f$\n", tempPriceCheck);

                ticketCost += tempPriceCheck;
                flightDistanceRemaining -= flightRangeInKM;


                //More than 200KM
                tempPriceCheck = (flightDistanceRemaining * farFlightCostPerKM);

                System.out.printf("Above 200KM (201+ KM) Cost is %.2f per KM, and you travel %d in that range ", farFlightCostPerKM, flightDistanceRemaining);
                System.out.printf("There for : \t+%.2f$\n", tempPriceCheck);

                ticketCost += tempPriceCheck;

            }
            else //More than 100KM less than 201KM
            {
                tempPriceCheck = (flightDistanceRemaining * midFlightCostPerKM);

                System.out.printf("Second 100KM (101 - 200 KM) Cost is %.2f per KM, and you travel %d in that range ", midFlightCostPerKM, flightDistanceRemaining);
                System.out.printf("There for : \t+%.2f$\n", tempPriceCheck);

                ticketCost += tempPriceCheck;
            }
        }
        else //Less or equal to 100KM
        {
            tempPriceCheck = (flightDistanceRemaining * closeFlightCostPerKM);

            System.out.printf("First 100KM (0 - 100 KM) Cost is %.2f per KM, and you travel %d in that range ", closeFlightCostPerKM, flightDistanceRemaining);
            System.out.printf("There for : \t+%.2f$\n", tempPriceCheck);

            ticketCost += tempPriceCheck;
        }

        System.out.printf("Your Ticket Price after Distance Calculation: %.2f$\n", ticketCost);

        isStorm = randomVal.nextBoolean(); //Storm Chance (Yes/No)
        if (isStorm)
        {
            ticketCost *= 2;

            System.out.printf("\nUnfortunately we Have a STORM on the way so.. that sucks and all\n" +
                    "And your Ticket Price gets doubled from %.2f$ to %.2f$\n", (ticketCost / 2), ticketCost);
        }

        if (currentPlanePassengersAmount == fullPlanePassengersAmount) // Full Plane (10% Discount)
        {
            System.out.printf("\nThe Good News The Plane is Full So You Receive a 10%% Discount On The Ticket Cost\n" +
                    "Ticket Cost From %.2f$ to %.2f$\n", ticketCost, (ticketCost * 0.9f));

            ticketCost = ticketCost * 0.9f;
        }
        else if (currentPlanePassengersAmount > (fullPlanePassengersAmount * 0.9f)) // +90% Of Plane (5% Discount)
        {
            System.out.printf("\nThe Good News The Plane is +90%% Full So You Receive a 5%% Discount On The Ticket Cost\n" +
                    "Ticket Cost From %.2f$ to %.2f$\n", ticketCost, (ticketCost * 0.95f));

            ticketCost = ticketCost * 0.95f;
        }
        System.out.println("+=================================================================================+");

    }
}
