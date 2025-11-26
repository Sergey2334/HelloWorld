package Lesson5;

public class Exercise13 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 5, -41, 41, 56, 12};
        int maxVal = getMaxValueFromArray(myArray);
        System.out.println(maxVal);
    }

    public static int getMaxValueFromArray(int[] array)
    {
        int maxVal = array[0];

        for (int i = 1; i < array.length; i++)
        {
            if  (array[i] > maxVal)
            {
                maxVal = array[i];
            }
        }

        return maxVal;
    }
}
