import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salary = 0;
        int years = 0;

        System.out.printf("Enter Salary : ");
        salary = input.nextFloat();
        System.out.printf("Enter Years : ");
        years = input.nextInt();

        if (years % 5 == 0) // 10% once
        {
            salary = salary + (salary / 10);
        }

        System.out.printf("Years are : %d %nThe Salary After Bonus is: %f", years, salary);

    }
}
