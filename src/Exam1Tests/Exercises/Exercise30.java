package Exam1Tests.Exercises;

public class Exercise30 {
    public static void main(String[] args) {
        int[] numbersArray = {1, 5, 9, 5};
        int targetNumber = 5;

        System.out.println(getNumberCountFromArray(numbersArray,targetNumber));
    }

    private static int getNumberCountFromArray(int[] numbersArray, int targetNumber)
    {
        int count = 0;

        for (int i = 0; i < numbersArray.length; i++)
        {
            if (numbersArray[i] == targetNumber)
            {
                count++;
            }
        }

        return  count;
    }
}
