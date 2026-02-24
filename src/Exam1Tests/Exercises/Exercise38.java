package Exam1Tests.Exercises;

public class Exercise38 {
    public static void main(String[] args) {
        int[] numbersArray = {6, 9, 4 , -9, 8, 12, 7, 9, 3};
        int number = 9;

        System.out.println(getXFromArray(numbersArray, number));
    }

    private static int getXFromArray(int[] numbersArray, int number)
    {
        int leftDistanceFromNumber = -1;
        int rightDistanceFromNumber = -1;

        for (int i = 0; i < numbersArray.length; i++)
        {
            if (numbersArray[i] == number)
            {
                leftDistanceFromNumber = i;
                break;
            }
        }

        for (int i = numbersArray.length - 1; i >= 0; i--)
        {
            if (numbersArray[i] == number)
            {
                rightDistanceFromNumber = numbersArray.length - i - 1;
                break;
            }
        }

        int x = leftDistanceFromNumber + rightDistanceFromNumber;

        if (x < 0)
        {
            return number;
        }

        return x;
    }
}
