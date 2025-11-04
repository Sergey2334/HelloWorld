import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = 0;
        String name = "";

        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.print("Please enter your age: ");
        age = input.nextInt();

        System.out.printf("Hello %s , Your age is %d", name, age);
    }

}
