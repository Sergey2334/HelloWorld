import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        float num2 = input.nextInt();
        System.out.print("Enter the operand (+, -, *, /): ");
        String operand = input.next();

        float sum = 0;

        if (operand.equals("+"))
        {
            sum = num1 + num2;
            System.out.printf("%f %s %f = %f",num1 , operand, num2, sum);
        }
        else if (operand.equals("-"))
        {
            sum = num1 - num2;
            System.out.printf("%f %s %f = %f",num1 , operand, num2, sum);
        }
        else if (operand.equals("*"))
        {
            sum = num1 * num2;
            System.out.printf("%f %s %f = %f",num1 , operand, num2, sum);
        }
        else if (operand.equals("/"))
        {
            sum = num1 / num2;
            System.out.printf("%f %s %f = %f",num1 , operand, num2, sum);
        }
        else
        {
            System.out.println("Invalid input :(");
        }

    }
}
