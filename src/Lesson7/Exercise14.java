package Lesson7;

public class Exercise14 {
    public static void main(String[] args) {
        String[] myStringArray = {"Hello", "World", "Race Car", "MaDAM", "Never odd or even", "Lewd I did live & evil did I dwel"
                                    , "kayak", "LevEl"};

        for (int i = 0; i < myStringArray.length; i++)
        {
            System.out.printf("%s => ", myStringArray[i]);
            System.out.println(isStringPalindrome(myStringArray[i]));
        }

    }

    public static boolean isStringPalindrome(String str)
    {
        //System.out.println(str);

        str = str.toLowerCase();

        // Sets a Character Class of a-z, A-Z and 0-9 and negates it, Replace Everything that is not in that Class
        // Removes any Non-Alphanumeric Symbol
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        //System.out.println(str);

        // Checks Opposite Characters
        for (int i = 0; i < str.length() / 2; i++)
        {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
            {
                return false;
            }
        }
        return true;
    }
}
