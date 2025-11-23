package Lesson2;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;

        int maxNum = 100000;

        int num3 = 1;

        while (num1 <= maxNum) {
            System.out.printf("Number : %d %n", num3);
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
