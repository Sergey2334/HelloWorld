package Lesson7;

public class Exercise10 {
    public static void main(String[] args) {
        String str1 = "John";
        String str2 = "Doe";
        String str3 = "Johnson";
        String str4 = "Joe";
        String str5 = "John";
        String str6 = "John ";
        String str7 = " John ";
        String str8 = " John";

        String toFind = "oe";

        String[] strArray = {str1, str2, str3, str4, str5, str6, str7, str8};
        String[] strArrayThatContainsASubString = getStringsThatContainsASubString(strArray, toFind);
        for (int i = 0; i < strArrayThatContainsASubString.length; i++)
        {
            System.out.println(strArrayThatContainsASubString[i]);
        }

    }

    public static String[] getStringsThatContainsASubString(String[] strArray, String toFind)
    {
        int containsCount = 0;
        int[] strArrayIndex = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++)
        {
            if (strArray[i].contains(toFind))
            {
                containsCount++;
                strArrayIndex[i] = 1;
            }
        }

        String[] strArrayThatContainsASubString = new String[containsCount];
        for (int i = 0, j = 0; i < strArrayIndex.length; i++) // i - strArrayIndex Index , j - strArrayThatContainsASubString Index
        {
            if (strArrayIndex[i] == 1)
            {
                strArrayThatContainsASubString[j] = strArray[i];
                j++;
            }
        }

        return strArrayThatContainsASubString;
    }
}
