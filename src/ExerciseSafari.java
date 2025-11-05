import java.util.Scanner;

public class ExerciseSafari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int openingHour = 10;
        int closingHour = 20;

        System.out.print("Enter the time you will arrive at the Safari (XX:00) : ");
        int arrivedHour = input.nextInt();

        if (arrivedHour >= openingHour && arrivedHour < closingHour)
        {
            int hoursLeft = closingHour - arrivedHour;
            System.out.printf("You can enter the Safari and you have %d hours left", hoursLeft);
        }
        else
        {
            System.out.println("The Safari is Closed :'(");
        }
    }
}
