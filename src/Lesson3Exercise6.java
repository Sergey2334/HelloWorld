import java.util.Random;

public class Lesson3Exercise6 {
    public static void main(String[] args) {
        Random randVal = new Random();

        int number = randVal.nextInt(0, 1000);

        System.out.printf("The Random NUmber is : %d%n", number);

        if (number % 3 == 0)
        {
            System.out.println("You Got Bonus Points :D");
        }
    }
}
