package Lesson2;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(gcd(93, 27));
    }

    public static int gcd(int num1, int num2)
    {
        int remainder = num1 % num2;

        if (remainder == 0)
        {
            return num2;
        }
        else
        {
            return gcd(num2, remainder);
        }
    }
}
