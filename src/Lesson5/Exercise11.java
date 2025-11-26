package Lesson5;

public class Exercise11 {
    public static void main(String[] args) {
        int[] myArray = new  int[10];
        boolean breakLine = true;
        printArray(myArray, breakLine);
    }

    public static void printArray(int[] array, boolean breakline)
    {
        if (breakline)
        {
            for (int i = 0; i < array.length; i++)
            {
                System.out.println(array[i]);
            }
        }

        else
        {
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
