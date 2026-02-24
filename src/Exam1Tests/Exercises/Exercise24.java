package Exam1Tests.Exercises;

public class Exercise24 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++)
        {
            if (isNumberPretty(i))
            {
                System.out.println(i);
            }
        }
    }

    private static boolean isNumberPretty(int number)
    {
        boolean result = true;
        String numberAsString = String.valueOf(Math.abs(number));

        if (numberAsString.charAt(0) != numberAsString.charAt(numberAsString.length() - 1))
        {
            result = false;
        }

        return result;
    }
}
