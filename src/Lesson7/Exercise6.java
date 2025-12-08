package Lesson7;

public class Exercise6 {
    public static void main(String[] args) {
        String str1 = "John";
        String str2 = "Doe";
        String str3 = "Johnson";
        String str4 = "Joe";
        String str5 = "John";
        String str6 = "John ";
        String str7 = " John ";
        String str8 = " John";

        System.out.println(compare2Strings(str1, str5));
        System.out.println(compare2StringsUsingFor(str1, str5));
    }

    public static boolean compare2Strings(String str1, String str2)
    {
        if (str1.compareTo(str2) == 0)
        {
            return true;
        }
        return false;
    }

    public static boolean compare2StringsUsingFor(String str1, String str2)
    {
        if (str1.length() != str2.length())
        {
            return false;
        }
        for (int i = 0; i < str1.length(); i++)
        {
            if (str1.charAt(i) != str2.charAt(i))
            {
                return false;
            }
        }
        return true;
    }
}
