package Lesson6;

public class Exercise2 {
    public static void main(String[] args) {
        float num1 = 100;
        float num2 = 20;
        System.out.println(isDivided(num1, num2));
    }

    public static boolean isDivided(float num1, float num2)
    {
        return num1 % num2 == 0;
    }

}
