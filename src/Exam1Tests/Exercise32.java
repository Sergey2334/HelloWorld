package Exam1Tests;

public class Exercise32 {
    public static void main(String[] args) {
        int[] numbersArray1 = {1, 5, 9, 5};
        int[] numbersArray2 = {1, 5, 9, 5};

        System.out.println(getBiggerArray(numbersArray1,numbersArray2));
    }

    private static int getSum (int[] numbersArray)
    {
        int sum = 0;

        for (int i = 0; i < numbersArray.length; i++)
        {
            sum += numbersArray[i];
        }

        return sum;
    }

    private static int getBiggerArray(int[] numbersArray1, int[] numbersArray2)
    {
        int result = 0;
        int numbersArray1Sum = getSum(numbersArray1);
        int numbersArray2Sum = getSum(numbersArray2);

        if (numbersArray1Sum > numbersArray2Sum)
        {
            result = 1;
        }
        else if (numbersArray2Sum > numbersArray1Sum)
        {
            result = 2;
        }

        return result;
    }
}
