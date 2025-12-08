package Lesson7;

public class Exercise13 {
    public static void main(String[] args) {
        String myString1 = "JohnBobJoeBObbyRoobert";
        String myString2 = "aaabBBCcCDddEEeEFf";
        String myString3 = "I want it, I got it";
        String myString4 = "I Want It, I Got It";
        String myString5 = "i WaNt IT, I gOt iT";
        char[] charArray = initializeLowerCaseAlphabet();

        System.out.println(getFirstPopularCharFromArray(myString1, charArray));
        System.out.println(getFirstPopularCharFromArray(myString2, charArray));
        System.out.println(getFirstPopularCharFromArray(myString3, charArray));
        System.out.println(getFirstPopularCharFromArray(myString4, charArray));
        System.out.println(getFirstPopularCharFromArray(myString5, charArray));
    }

    public static char getFirstPopularCharFromArray(String str, char[] charArray)
    {
        // Converts str to Lower Case
        str = str.toLowerCase();

        // Converts charArray to Lower Case
        charArray = convertCharArrayToLowerCase(charArray);

        // Each element will correspond to the Character Count in the String
        // Example :
        // A b C D E f g h I J
        // 0 0 4 5 1 6 9 4 2 0
        int[] charArrayCount = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++)
        {
            // Case-Sensitive
            // Gives Array of Strings and the amount of Strings is the Amount of The Substring + 1
            // + "" To Make a Char to a Temporary String

            //String[] tempStrArray = str.split(charArray[i] + "");
            charArrayCount[i] = str.split(charArray[i] + "").length - 1;
        }

        int indexOfPopularChar = 0;
        int tempPopularCharAmount = 0;
        for (int i = 0; i < charArrayCount.length; i++)
        {
            // In the Exercise they want the FIRST Most Popular in the CharArray, that's why > and not >=
            if (charArrayCount[i] > tempPopularCharAmount)
            {
                tempPopularCharAmount = charArrayCount[i];
                indexOfPopularChar = i;
            }
        }

        return charArray[indexOfPopularChar];
    }

    // Initialize Full Lower Case Alphabet Characters Using ASCII Values :D
    public static char[] initializeLowerCaseAlphabet()
    {
        final int ALPHABET_SIZE = 26;
        char[] charArray = new char[ALPHABET_SIZE];
        charArray[0] = 'a';
        for (int i = 0; i < charArray.length; i++)
        {
            charArray[i] = (char) (charArray[0] + i);
            //System.out.println(charArray[i]);
        }
        return charArray;
    }

    // Converts Char Array to Lower Case
    public static char[] convertCharArrayToLowerCase(char[] charArray)
    {
        for(int i = 0; i < charArray.length; i++)
        {
            //System.out.printf("%c ", charArray[i]);
            charArray[i] = Character.toLowerCase(charArray[i]);
            //System.out.printf("%c ", charArray[i]);
        }
        return charArray;
    }
}
