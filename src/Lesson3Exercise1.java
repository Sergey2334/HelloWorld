import java.util.Scanner;

public class Lesson3Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number bigger than 1000: ");
        int number = input.nextInt();

        if (number > 1000) {
            System.out.println("Success");
        }
        else {
            System.out.println("Failure");
        }
    }
}
