package Exam1Tests.ExamExercises;

public class Exercise3LongestEqualSequence {
    public static void main(String[] args) {
        int[] array1 = {5, 6, 8, 11, 15};
        int[] array2 = {1, 2, 2, 2, 3, 4, 4, 1, 1, 1, 1, 5};
        int[] array3 = {1, 2, 2, 2, 2, 2, 3, 4, 4, 1, 1, 1, 1, 5};

        System.out.println(longestEqualSequence(array1));
        System.out.println(longestEqualSequence(array2));
        System.out.println(longestEqualSequence(array3));
    }

    public static int longestEqualSequence(int[] array)
    {
        int max = 0;

        for (int i = 0; i < array.length; i++)
        {
            int current = array[i]; // Pointless
            int count = 0;

            for (int j = 0; j < array.length; j++)
            {
                if (array[i] == array[j])
                {
                    count++;
                    if (max < count)
                    {
                        max = count;
                    }
                }

                else
                {
                    count = 0;
                }
            }
        }

        return max;
    }
}
