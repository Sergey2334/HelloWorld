package Lesson7;

public class Exercise3 {
    public static void main(String[] args) {
        String firstName = "John";
        int number = 4;
        System.out.println(checkStrLength(firstName, number));
    }

    public static boolean checkStrLength(String str, int num)
    {
        if(str.length() == num)
        {
            return true;
        }
        return false;
    }
}
