package Lesson5;

public class Exercise6 {
    public static void main(String[] args) {

        int maxVal = 10;

        for (int i = 1; i <= maxVal; i++)
        {
            for (int j = 1; j <= maxVal; j++)
            {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}
