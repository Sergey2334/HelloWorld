package Exam1Tests.Exercises.WebsiteExercises;

import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        Random rand = new Random();
        final int bound = 1000;

        int randomNumber = rand.nextInt(bound);

        System.out.println("Random number: " + randomNumber);

        if (randomNumber % 3 == 0)
        {
            System.out.println("You Received A Bonus ! :D");
        }
    }
}
