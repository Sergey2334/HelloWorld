import java.sql.Array;
import java.util.Scanner;

public class Lesson3Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberCount = 3;
        int numbers[] = new int[numberCount];

        System.out.println("Please enter 3 Numbers..");

        for (int i = 0; i < numberCount; i++)
        {
            System.out.printf("Enter number %d# : ", i + 1);
            numbers[i] = input.nextInt();
        }

        if (Math.abs(numbers[0] - numbers[1]) == Math.abs(numbers[1] - numbers[2]))
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Failure");
        }
    }
}
