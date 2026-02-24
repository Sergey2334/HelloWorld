package Exam1Tests.ExamExercises;

public class Exercise2 {
    public static void main(String[] args) {
        String str1 = "GFAAFGGAFGAF";
        String str2 = "GFAAFGGAFGAFFGA";

        System.out.println(is2StringTripleMixWithEqualChars(str1, str2));
    }

    private static boolean is2StringTripleMixWithEqualChars(String str1, String str2)
    {
        boolean result = true;

        if (isStringTripleMix(str1) && isStringTripleMix(str2))
        {
            char[] charArray1 = str1.substring(0, 3).toCharArray();
            char[] charArray2 = str2.substring(0, 3).toCharArray();

            if (!isCharArraysEqual(charArray1, charArray2))
            {
                result = false;
            }
        }

        else
        {
            result = false;
        }

        return  result;
    }

    private static boolean isStringTripleMix(String string)
    {
        boolean result = true;
        final int length = 3;
        final int size = string.length();

        if (size % length == 0)
        {
            String[] subStrings = getEqualSubStringsFromString(string, length);

            char[] charArray = getCharsFromSubString(subStrings[0]);

            for (int i = 0; i < subStrings.length; i++)
            {
                if (!result)
                {
                    break;
                }

                if (isDuplicatedChars(getCharsFromSubString(subStrings[i])))
                {
                    result = false;
                    break;
                }

                for (int j = 0; j < charArray.length; j++)
                {
                    if (!subStrings[i].contains("" + charArray[j]))
                    {
                        result = false;
                        break;
                    }
                }
            }
        }

        else
        {
            result = false;
        }

        return result;
    }

    private static String[] getEqualSubStringsFromString(String string, int subStringLength)
    {
        int stringSize =  string.length();
        int numberOfSubStrings = 0;

        if  (stringSize % subStringLength == 0)
        {
            numberOfSubStrings = (stringSize / subStringLength);

        }

        else
        {
            numberOfSubStrings = (stringSize / subStringLength) + 1;
        }

        String[] subStringsOfString = new String[numberOfSubStrings];

        for (int i = 0, j = 0; i < stringSize; i += subStringLength, j++)
        {
            subStringsOfString[j] = string.substring(i, Math.min(i + subStringLength, stringSize));
        }

        return subStringsOfString;
    }

    private static char[] getCharsFromSubString(String string)
    {
        int stringSize = string.length();
        char[] charsOfString = new char[stringSize];

        for (int i = 0; i < stringSize; i++)
        {
            charsOfString[i] = string.charAt(i);
        }

        return charsOfString;
    }

    private static boolean isDuplicatedChars(char[] chars)
    {
        boolean result = false;

        for (int i = 0; i < chars.length; i++)
        {
            for (int j = i; j < chars.length; j++)
            {
                if (i != j && chars[i] == chars[j])
                {
                    result = true;
                }
            }
        }

        return result;
    }

    private static boolean isCharArraysEqual(char[] charsArray1, char[] charsArray2)
    {
        boolean result = true;

        for (int i = 0; i < charsArray1.length; i++)
        {
            for (int j = 0; j <  charsArray2.length; j++)
            {
                if (!(String.valueOf(charsArray1)).contains(String.valueOf(charsArray2[j])))
                {
                    result = false;
                }

                if (!result)
                {
                    break;
                }
            }
        }

        return result;
    }
}
