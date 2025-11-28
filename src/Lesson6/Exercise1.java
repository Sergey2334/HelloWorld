package Lesson6;

public class Exercise1 {
    public static void main(String[] args) {

        float num1 = 11;
        float num2 = 20;
        float num3 = 30;
        System.out.println(isBiggerThan10(num1, num2, num3));
    }

    public static boolean isBiggerThan10 (float num1 , float num2, float num3)
    {
        return num1 > 10 && num2 > 10 && num3 > 10;
    }
}
