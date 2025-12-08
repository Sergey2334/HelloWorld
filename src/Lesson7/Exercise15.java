package Lesson7;

public class Exercise15 {
    public static void main(String[] args) {
        String myString1 = "JohnBobJoeBObbyRoobert";
        String myString2 = "Hello, World!";
        String myString3 = "I want it, I got it";
        String myString4 = "I want it, I Got it";
        String myString5 = "Hello From Java!";

        System.out.println(getFirstCharFromStringNotDuplicate(myString1));
        System.out.println(getFirstCharFromStringNotDuplicate(myString2));
        System.out.println(getFirstCharFromStringNotDuplicate(myString3));
        System.out.println(getFirstCharFromStringNotDuplicate(myString4));
        System.out.println(getFirstCharFromStringNotDuplicate(myString5));

    }

    public static String getFirstCharFromStringNotDuplicate(String str)
    {
        // Converts to Lower Case - Note: If we use it now End String will all be Lower Case :'(
        //str = str.toLowerCase();

        // Removes all Symbols that are not Letters and White Spaces " "
        str = str.replaceAll("[^a-zA-Z ]", "");

        // Removes Extra White Space (Trims it :))
        str = str.trim();

        // Gets Every Word In The String and Splits it into Sub Strings
        String[] strArray = str.split(" ");

        String returnedString = "";
        for (int i = 0; i < strArray.length; i++)
        {
            char tempChar = strArray[i].charAt(0); // First Letter of Every Word, i - Word Index
            char tempCharLowerCase = strArray[i].toLowerCase().charAt(0); // Convert To Lower Case for Comparing

            // Converting to Lower Case to Compare
            if (returnedString.toLowerCase().indexOf(tempCharLowerCase) == -1) // Doesn't Exists
            {
                // And Concatenating The Original Case Character
                returnedString = returnedString.concat(tempChar + "");
            }
        }
        return returnedString;
    }
}
