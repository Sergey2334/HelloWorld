package Exam1Tests.Exercises;

public class Exercise46 {
    public static void main(String[] args) {
        int number = 54535643;
        int digit = 5;

        System.out.println(removeDigitFromNumber(number,digit));
    }

    private static int removeDigitFromNumber(int number, int digit)
    {
        String numberString = "" + number;
        numberString = numberString.replace("" + digit, "");

        return Integer.parseInt(numberString);
    }
}
