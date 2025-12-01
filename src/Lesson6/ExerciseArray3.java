package Lesson6;

public class ExerciseArray3 {
    public static void main(String[] args) {
        float[] myArray = getArray(5, 3.2f);
    }

    public static float[] getArray(int size, float value)
    {
        float[] array = new float[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = value;
        }
        return array;
    }
}
