package Lesson7;

public class Exercise9 {
    public static void main(String[] args) {
        String str1 = "$";
        String str2 = "ab$cde";
        String str3 = "abcde$";
        String str4 = "";
        String str5 = "abcdef";

        String[] strArray1 = {str1, str2, str3}; // str1
        String[] strArray2 = {str4, str5}; // Empty
        String[] strArray3 = {str4, str3, str5}; // str3

        System.out.println(getFirstStringContainsChar(strArray1));
        System.out.println(getFirstStringContainsChar(strArray2));
        System.out.println(getFirstStringContainsChar(strArray3));
    }

    public static String getFirstStringContainsChar(String[] stringsArray)
    {
        char toCheck = '$';

        for (int i = 0; i < stringsArray.length; i++)
        {
            if (stringsArray[i].indexOf(toCheck) != -1)
            {
                return stringsArray[i];
            }
        }
        return "No String Contains '$'";
    }
}
