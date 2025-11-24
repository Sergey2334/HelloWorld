package Lesson5;

public class Exercise10 {
    public static void main(String[] args) {
        final int limit = 10;
        for(int i = 0; i <= limit; i++)
        {
            for(int j = 0; j <= limit; j++)
            {
                System.out.printf("%d\t", i + j);
            }
            System.out.println();
        }
    }
}
