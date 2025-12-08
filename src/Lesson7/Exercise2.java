package Lesson7;

public class Exercise2 {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        printLongestStr(firstName, lastName);
    }

    public static void printLongestStr(String str1, String str2)
    {
        if (str1.length() > str2.length())
        {
            System.out.println(str1);
        }
        else
        {
            System.out.println(str2);
        }
    }
}
