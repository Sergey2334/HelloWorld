package Lesson7;

import java.util.Arrays;

public class Exercise11 {
    public static void main(String[] args) {
        String str1 = "John";
        String str2 = "Doe";
        String str3 = "Johnson";
        System.out.println(reverseArray(str1));
        System.out.println(reverseArray(str2));
        System.out.println(reverseArray(str3));
    }

    public static String reverseArray(String str)
    {
        char[] strReversed = new char[str.length()];
        for(int i = 0; i < str.length(); i++)
        {
            strReversed[i] = str.charAt(str.length() - 1 - i);
        }
        return new String(strReversed); // Converts char[] to String, Isn't it the same ?
    }
}
