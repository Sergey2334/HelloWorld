import java.util.Scanner;

public class ExerciseLoopsB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Amount of Numbers in the Series: ");
        int n =  input.nextInt(); //Amount of Numbers in Series
        int sum = 0;

        for(int i = 0; i <= n; i++)
        {
            sum += i;
        }
        System.out.printf("The Sum is %d", sum);
    }
}
