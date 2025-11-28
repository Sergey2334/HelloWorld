package Lesson6;

public class Exercise3 {
    public static void main(String[] args) {
        float num1 = 0;
        float num2 = 0;
        float num3 = -20;
        System.out.println(are2Positives(num1, num2, num3));

    }

    public static boolean are2Positives(float num1, float num2, float num3)
    {
        int positiveCount = 0;
        if (num1 >= 0)
        {
            positiveCount++;
        }
        if (num2 >= 0)
        {
            positiveCount++;
        }
        if (num3 >= 0)
        {
            positiveCount++;
        }

        if (positiveCount >= 2)
        {
            return true;
        }
        return false;
    }
}
