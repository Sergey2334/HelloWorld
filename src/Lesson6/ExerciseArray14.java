package Lesson6;

public class ExerciseArray14 {
    public static void main(String[] args) {
        int number = 451;

        int[] myArray = convertNumberToArray(number);
        for (int i = 0; i < myArray.length; i++)
        {
            System.out.printf("[%d] ", myArray[i]);
        }
    }

    public static int[] convertNumberToArray(int number)
    {
        if (number == 0)
        {
            return new int[] {0};
        }

        int digitCount = 0;
        for(int i = 1; number / i != 0; i *= 10, digitCount++); // Gets New Array Size, By Digits Count

        int[] array = new int[digitCount]; // Initializes New Array

        for(int i = array.length - 1, j = 1; i >= 0; i--, j *= 10) // i - arrayIndex , j - get currentDigit
        {
            array[i] = (number % (j * 10)) / (j);
        }
        return array;
    }
}
