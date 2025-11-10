import java.util.Scanner;

public class Lesson3Exercise6a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int greatGPA = 90;
        int goodGPA = 70;

        System.out.print("Please enter your GPA: ");
        int gpa = input.nextInt();

        if(gpa >= greatGPA)
        {
            System.out.println("You have a Great GPA");
        }
        else if (gpa >= goodGPA)
        {
            System.out.println("You have a Good GPA");
        }
        else
        {
            System.out.println("You have an OK GPA");
        }
    }
}
