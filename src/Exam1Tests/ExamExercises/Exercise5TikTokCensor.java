package Exam1Tests.ExamExercises;

import java.util.Arrays;

public class Exercise5TikTokCensor {
    public static void main(String[] args) {
        String[] forbiddenWords = {"bad", "kill", "fight"};
        String caption = "I want to fight lets go f*ght !";

        System.out.println(Arrays.toString(tiktokCensor(caption, forbiddenWords)));
    }

    private static String[] tiktokCensor(String caption, String[] forbiddenWords)
    {
        String result = "";
        String[] captionWords = caption.split(" ");

        for (int i = 0; i < captionWords.length; i++)
        {
            if (isNeededToCensor(captionWords[i], forbiddenWords) || isNeededToCensorV2(captionWords[i], forbiddenWords))
            {
                result += censorWord(captionWords[i]) + " ";
            }

            else
            {
                result += captionWords[i] + " ";
            }
        }

        return result.split(" ");
    }

    private static String censorWord(String word)
    {
        String result = "";

        for (int i = 0; i < word.length(); i++)
        {
            result += "*";
        }

        return  result;
    }

    private static boolean isNeededToCensor(String word, String[] forbiddenWords)
    {
        boolean result = false;

        for (int i = 0; i < forbiddenWords.length; i++)
        {
            if (forbiddenWords[i].equals(word))
            {
                result = true;
            }
        }

        return result;
    }

    private static boolean isNeededToCensorV2(String word, String[] forbiddenWords)
    {
        boolean result = false;

        int wordLength = word.length();

        for (int i = 0; i < forbiddenWords.length; i++)
        {
            int currentForbiddenWordLength = forbiddenWords[i].length();

            if (wordLength != currentForbiddenWordLength)
            {
                continue;
            }

            int count = wordLength;
            for (int j = 0; j < wordLength; j++)
            {
                if (word.charAt(j) == forbiddenWords[i].charAt(j))
                {
                    count--;
                }
            }

            if (count == 1)
            {
                result = true;
                break;
            }
        }

        return result;
    }
}
