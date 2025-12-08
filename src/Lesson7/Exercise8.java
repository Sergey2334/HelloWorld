package Lesson7;

import javax.lang.model.element.NestingKind;

public class Exercise8 {
    public static void main(String[] args) {
        String format1v1  = "0501234567";
        String format1v2  = "0507894561";
        String format2v1  = "050-1234567";
        String format2v2  = "050-9876543";
        String format3v1  = "972501234567";
        String format3v2  = "972509876543";

        String wrong1   = "0401234567";
        String wrong2   = " 0501234567";
        String wrong3   = "0501234567 ";
        String wrong4   = "05-01234567";
        String wrong5   = "972401234567";
        String wrong6   = "9721234567";
        String wrong7   = "97250-1234567";
        String wrong8   = "050-12345678";
        String wrong9   = "040-12345678";
        String wrong10  = "040-12345678";

        String[] strArray = {format1v1, format1v2, format2v1, format2v2, format3v1, format3v2, wrong1, wrong2, wrong3, wrong4, wrong5, wrong6, wrong7, wrong8, wrong9, wrong10};

        for (int i = 0; i < strArray.length; i++)
        {
            System.out.print(strArray[i]);
            System.out.print(" => ");
            System.out.println(checkPhoneNumber(strArray[i]));
        }

    }

    public static String checkPhoneNumber(String inputtedPhoneNumber)
    {
        String outputtedPhoneNumber = inputtedPhoneNumber;
        int format = 0;

        if (    inputtedPhoneNumber.length() == 10 &&
                inputtedPhoneNumber.substring(0, 2).compareTo("05") == 0) // 0501234567 , 10 Chars , format 1
        {
            format = 1;
            //System.out.println("Format 1");
        }
        else if (   inputtedPhoneNumber.length() == 11 &&
                    inputtedPhoneNumber.substring(0, 2).compareTo("05") == 0 &&
                    inputtedPhoneNumber.charAt(3) == '-') // 050-1234567 , 11 Chars , format 2
        {
            format = 2;
            //System.out.println("Format 2");
        }
        else if (inputtedPhoneNumber.length() == 12 && inputtedPhoneNumber.substring(0, 4).compareTo("9725") == 0) // 972501234567 , 12 Chars , format 3
        {
            format = 3;
            //System.out.println("Format 3");
        }

        // The Inputted Phone Is Valid :D

        switch (format){
            case 1:
                outputtedPhoneNumber = insertHyphenToPhoneNumber(inputtedPhoneNumber);
                break;

            case 2: // Format 2 = Good :D
                outputtedPhoneNumber = inputtedPhoneNumber;
                break;

            case 3:
                outputtedPhoneNumber = inputtedPhoneNumber.replaceFirst("972", "0");
                outputtedPhoneNumber = insertHyphenToPhoneNumber(outputtedPhoneNumber);
                break;

            default:
                outputtedPhoneNumber = ""; // "" Empty String
                break;
        }
        return outputtedPhoneNumber;
    }

    public static String insertHyphenToPhoneNumber(String inputtedPhoneNumber)
    {
        // 0 5 0 - 1 2 3 4 5 6 7
        // 0 1 2 3 4 5 6 7 8 9 10
        int index = 3;

        String prefix = inputtedPhoneNumber.substring(0, index);
        char toInsert = '-';
        String numberBody =  inputtedPhoneNumber.substring(index);

        return prefix + toInsert + numberBody;
    }
}
