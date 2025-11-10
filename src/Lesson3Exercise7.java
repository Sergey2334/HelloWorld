import java.util.Scanner;

public class Lesson3Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberCount = 3;
        int numbers[] = new int[numberCount];

        System.out.println("Please enter 3 Whole Numbers..");

        for (int i = 0; i < numberCount; i++)
        {
            System.out.printf("Enter Whole number %d# : ", i + 1);
            numbers[i] = input.nextInt();
        }

        if (numbers[0] >= numbers[1] && numbers[0] >= numbers[2])
        {
            System.out.println("OK");
        }

    }
}
