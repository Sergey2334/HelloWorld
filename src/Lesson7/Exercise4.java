package Lesson7;

public class Exercise4 {
    public static void main(String[] args) {
        String str1 = "John";
        String str2 = "Doe";
        String str3 = "Johnson";
        String str4 = "Joe";
        String str5 = "John";
        String str6 = "John ";
        String str7 = " John ";
        String str8 = " John";
        System.out.println(compare2Strings(str1, str8));
    }

    public static int compare2Strings(String str1,  String str2)
    {
        if (str1.compareTo(str2) == 0)
        {
            return 1;
        }
        else if (str1.charAt(0) == str2.charAt(0))
        {
            return 2;
        }
        return 3;
    }
}
