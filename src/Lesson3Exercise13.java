import java.util.Scanner;

public class Lesson3Exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float baseSalary = 0;
        float saleGoal = 0;
        float currentSales = 0;
        float currentSalary = 0;

        System.out.print("Please enter you Base Salary: ");
        baseSalary = input.nextFloat();
        System.out.print("Please enter you Sale Goal: ");
        saleGoal = input.nextFloat();
        System.out.print("Please enter your Current Sales: ");
        currentSales = input.nextFloat();

        if (currentSales >= saleGoal)
        {
            //bonus 75%
            currentSalary = baseSalary * 1.75f;
            System.out.printf("You Received a Bonus and your Salary is : %f", currentSalary);
        }
        else if (currentSales >= saleGoal * 0.5f)
        {
            //bonus 2000$
            currentSalary = baseSalary + 2000;
            System.out.printf("You Received a Bonus and your Salary is : %f", currentSalary);
        }
        else
        {
            //Base Salary
            currentSalary = baseSalary;
            System.out.printf("Your Salary is : %f", currentSalary);
        }

    }
}
