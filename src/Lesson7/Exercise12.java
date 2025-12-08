package Lesson7;

public class Exercise12 {
    public static void main(String[] args) {
        String str1 = "John";
        String str2 = "Doe";
        String str3 = "12345678";
        String str4 = "0123456789";
        String str5 = "!123456789";
        String str6 = "s123456789";
        String str7 = "!avsb";
        String str8 = "$avsb1234";
        String str9 = "password";
        String str10 = "!password!";
        String str11 = "passw0rd!";
        String str12 = "passw0rd%";

        String [] passwordsArray = {str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12};

        for(int i = 0; i < passwordsArray.length; i++)
        {
            System.out.print(passwordsArray[i]);
            System.out.print("\t=>\t");
            System.out.println(checkPasswordIntegrity(passwordsArray[i]));
        }

    }

    public static boolean checkPasswordIntegrity(String inputtedPassword)
    {
        // Length Check
        final int MIN_LENGTH = 8;
        final int MAX_LENGTH = 10;
        if (inputtedPassword.length() < MIN_LENGTH || inputtedPassword.length() > MAX_LENGTH)
        {
            System.out.print(" Length Check Flag ");
            return false;
        }

        // Initialize Digits Array
        int[] digitsArray = new int[10];
        for (int i = 0 ; i < digitsArray.length; i++)
        {
            digitsArray[i] = i;
        }

        // Digit Check
        boolean digitsPositiveFlag = false;
        for (int i = 0; i < inputtedPassword.length(); i++)
        {
            for (int j = 0; j < digitsArray.length; j++)
            {
                if (inputtedPassword.charAt(i) == digitsArray[j])
                {
                    digitsPositiveFlag = true;
                    break;
                }
            }
            if (digitsPositiveFlag)
            {
                break;
            }
        }
        if (!digitsPositiveFlag)
        {
            System.out.print(" Digits Check Flag ");
            return false;
        }

        // Initialize Symbols
        char[] acceptedSymbols = {'_', '$', '%'};

        // Symbols Check
        boolean symbolPositiveFlag = false;
        for (int i = 0; i < inputtedPassword.length(); i++)
        {
            for (int j = 0; j < acceptedSymbols.length; j++)
            {
                if (inputtedPassword.charAt(i) == acceptedSymbols[j])
                {
                    symbolPositiveFlag = true;
                    break;
                }
            }
            if (symbolPositiveFlag)
            {
                break;
            }
        }
        if (!symbolPositiveFlag)
        {
            System.out.print(" Symbols Check Flag ");
            return false;
        }

        return true;
    }
}
