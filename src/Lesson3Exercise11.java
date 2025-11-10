import java.util.Scanner;

public class Lesson3Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a 2 digit Number: ");
        int number = input.nextInt();

        if ((number / 100 == 0) && (number / 10 != 0))
        {
            System.out.println("2 Digit Number Accepted");

            int newNumber = (number / 10) + (number % 10);
            System.out.printf("New Number is : %d", newNumber);
        }
    }
}
