package Lesson7;

public class Exercise5 {
    public static void main(String[] args) {
        String firstName = "BOB";
        char letter = 'B';
        System.out.println(getCharAmount(firstName, letter));
    }

    public static int getCharAmount(String text, char toCount)
    {
        int count = 0;
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == toCount)
            {
                count++;
            }
        }
        return count;
    }
}
