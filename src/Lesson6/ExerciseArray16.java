package Lesson6;

public class ExerciseArray16 {
    public static void main(String[] args) {
        int number = 777;
        System.out.println(isNumberPalindrome(number));
    }

    public static boolean isNumberPalindrome(int number)
    {
        int digitCount = 0;
        for (int i = 1; number / i != 0; i *= 10, digitCount++);

        int[] arrayOfDigits = new int[digitCount];
        int[] arrayOfDigitsOpposite = new int[digitCount];

        for (int i = 0, j = 1; i < digitCount; i++, j *= 10)
        {
            int currentDigit = (number % (j * 10)) / (j);
            arrayOfDigits[i] = currentDigit;
            arrayOfDigitsOpposite[digitCount - 1 - i] = currentDigit;

            //System.out.printf("arrayOfDigits[%d] = %d\n", i, arrayOfDigits[i]);
            //System.out.printf("arrayOfDigitsOpposite[%d] = %d\n", i, arrayOfDigitsOpposite[ digitCount - 1 - i]);
        }

        for (int i = 0; i < digitCount; i++)
        {
            if (arrayOfDigits[i] != arrayOfDigitsOpposite[i])
            {
                return false;
            }
        }
        return true;
    }
}
