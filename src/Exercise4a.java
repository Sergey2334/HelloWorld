import java.util.Scanner;

public class Exercise4a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float salary = 0;
        int years = 0;

        System.out.printf("Enter Salary : ");
        salary = input.nextFloat();
        System.out.printf("Enter Years : ");
        years = input.nextInt();

        if  (years >= 5) // 10% per 5 years
        {
            salary = salary + ( (years / 5) * (salary / 10) );
        }

        System.out.printf("Years are : %d %nThe Salary After Bonus is: %f", years, salary);

    }
}
