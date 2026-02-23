package Exam1Tests;

public class Exercise25 {
    public static void main(String[] args) {
        int number = -52323523;
        char ch = '3';

        System.out.println(countInstanceOfChar(number, ch));
    }

    private static int countInstanceOfChar(int number, char targetChar)
    {
        int count = 0;
        String numberAsString = String.valueOf(number);

        for (int i = 0; i < numberAsString.length(); i++)
        {
            if (numberAsString.charAt(i) == targetChar)
            {
                count++;
            }
        }

        return count;
    }
}
