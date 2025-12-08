package Lesson7;

public class Exercise7 {
    public static void main(String[] args) {
        String str1 = "John";
        String str2 = "Doe";
        String str3 = "Johnson";
        String str4 = "Joe";
        String str5 = "John";
        String str6 = "John ";
        String str7 = " John ";
        String str8 = " John";

        String[] strArray = {str1, str2, str3, str4, str5, str6, str7, str8};

        System.out.println(getLongestStr(strArray));
    }

    public static String getLongestStr(String[] str)
    {
        String longest = "";

        for (int i = 0; i < str.length; i++)
        {
            if  (str[i].length() > longest.length())
            {
                longest = str[i];
            }
        }
        return longest;
    }
}
