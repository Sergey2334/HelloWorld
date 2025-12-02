package Lesson6;

public class ExerciseArray17 {
    public static void main(String[] args) {
        int[] myArray = {101, 224, 302, 451, 252, 684486, 777, 88, 91, -101, -120, 121};
        System.out.println(getPalindromeAmount(myArray));
    }

    public static int getPalindromeAmount(int[] array)
    {
        int palindromeCount = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (isNumberPalindrome(array[i]))
            {
                palindromeCount++;
            }
        }

        return palindromeCount;
    }

    // ExerciseArray16 :D
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
