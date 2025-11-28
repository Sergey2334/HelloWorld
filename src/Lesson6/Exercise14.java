package Lesson6;

import java.util.Random;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        gameLogic();
    }


    //=============================================================================================
    // WELCOME FUNCTION
    //=============================================================================================
    public static void printWelcome()
    {
        System.out.print("+=======================================================+\n");
        System.out.print("|\tHello And Welcome To The PASSCODE GUESSING Game !\t|\n");
        System.out.print("+=======================================================+\n");

        System.out.print("The Rules are as Follows: \n");
        System.out.print("There is a Random Passcode being created as we speak.. and you have to guess what is it !\n");
        System.out.print("The Passcode is a Random 4 Digit Code with the Digits Ranging From 1 to 6 ");
        System.out.print("(With No Duplicate Digits)*\n\n");
        System.out.print("You Have To Input a 4 Digit Code to Try and Find it\n");
        System.out.print("\t1.Each Incorrect Guess = -1 Tries\n");
        System.out.print("\t2.Inputting the same Digit Twice or more in a single Try = -2 Tries\n");
        System.out.print("Until no more Tries Left and Its GAME OVER !\n\n");
        System.out.print("Each Wrong Answer you will get a Tip\n");
        System.out.print("Tips:\n");
        System.out.print("\t1.Amount of Correct Digits, Wrong Spot\n");
        System.out.print("\t2.Amount of Correct Digits, Correct Spot\n\n");
        System.out.print("Good Luck , YOU CAN DO IT ! :D\n");
    }
    //_____________________________________________________________________________________________


    //=============================================================================================
    // ARRAY'S FUNCTIONS
    //=============================================================================================
    public static int[] getRandomPasscodeArray()
    {
        Random randVal = new Random();
        final int MAX_DIGITS = 4;
        final int MIN_BOUND = 1;
        final int MAX_BOUND = 6;

        int[] passcodeArray = new int[MAX_DIGITS];
        do
        {
            for (int i = 0; i < passcodeArray.length; i++)
            {
                passcodeArray[i] = randVal.nextInt(MIN_BOUND, MAX_BOUND);
            }
        }
        while (hasSameDigits(passcodeArray));

        // Cheat To See Passcode (Only Use For Debug , Unless Dishonest)
//        for (int i = 0; i < passcodeArray.length; i++)
//        {
//            System.out.printf("{%d} ",  passcodeArray[i]);
//        }
//        System.out.println();

        return  passcodeArray;
    }

    public static int[]  convertNumberToDigitsArray (int number)
    {
        int digitCount = 0;
        for(int i = 1; number / i != 0; i *= 10, digitCount++);

        final int MAX_DIGITS = 4;
        if(digitCount != MAX_DIGITS) // Checking if in Bounds
        {
            System.out.print("Invalid Passcode : ");
            if (digitCount > MAX_DIGITS)
            {
                System.out.print("To Long !\n");
            }
            else
            {
                System.out.print("To Short !\n");
            }
            return null;
        }

        int[] digitsArray =  new int[digitCount];
        for(int i = 1, j = 1; i <= digitCount; i++, j *= 10) // i - arrayIndex , j - digitCountIndex
        {
            digitsArray[MAX_DIGITS - i] = (number % (j * 10)) / (j);
        }

        return digitsArray;
    }

    public static boolean hasSameDigits(int[] digitsArray)
    {
        for(int i = 0; i < digitsArray.length; i++)
        {
            for (int j = i + 1; j < digitsArray.length; j++)
            {
                if (digitsArray[i] == digitsArray[j])
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static int[] compareArrays(int[] randomArray, int[] inputtedArray)
    {
        int[] tempArray = new int[randomArray.length];
        final int CORRECT_PLACE = 2;
        final int CORRECT_DIGIT = 1;
        final int INCORRECT     = 0;

        for (int i = 0; i < inputtedArray.length; i++)
        {
            tempArray[i] = INCORRECT;

            // Getting Correct Digit , Correct Place
            if (inputtedArray[i] == randomArray[i])
            {
                tempArray[i] = CORRECT_PLACE;
                continue;
            }

            // Getting Correct Digit , Wrong Place
            for (int j = 0; j < randomArray.length; j++)
            {
                if (inputtedArray[i] == randomArray[j])
                {
                    tempArray[i] = CORRECT_DIGIT;
                    break;
                }
            }
        }
        return tempArray;
    }
    //_____________________________________________________________________________________________


    //=============================================================================================
    // DIFFICULTY FUNCTIONS
    //=============================================================================================
    public static int getDifficulty()
    {
        Scanner input = new Scanner(System.in);

        final int EASY      = 1;
        final int MEDIUM    = 2;
        final int HARD      = 3;
        final int GAMBLER   = 4;
        final int EXIT      = 5;

        final int[] difficultyArray = {EASY, MEDIUM, HARD, GAMBLER, EXIT};

        System.out.print("\nChoose Difficulty: \n");
        System.out.print("--------------------\n");

        System.out.printf("\t%d. Easy -\t 20 Tries\n", EASY);
        System.out.printf("\t%d. Medium -\t 15 Tries\n", MEDIUM);
        System.out.printf("\t%d. Hard -\t 10 Tries\n", HARD);
        System.out.printf("\t%d. Random -\t between 5 to 25 Tries (If you like to Gamble)\n", GAMBLER);
        System.out.printf("\t%d. Exit\n",  EXIT);

        int difficultyLevel = -1;
        do
        {
            System.out.print("Enter Difficulty : ");
            difficultyLevel =  input.nextInt();
        }
        while (!checkDifficultyValidity(difficultyArray, difficultyLevel));

        return difficultyLevel;
    }

    public static boolean checkDifficultyValidity(int[] difficultyArray, int difficultyLevel)
    {
        for (int i = 0; i < difficultyArray.length; i++)
        {
            if (difficultyArray[i] == difficultyLevel)
            {
                return true;
            }
        }
        System.out.printf("Invalid Difficulty Level : %d\n", difficultyLevel);
        return false;
    }
    //_____________________________________________________________________________________________


    //=============================================================================================
    // GAME LOGIC FUNCTIONS
    //=============================================================================================
    public static int getTriesAmount(int difficultyLevel)
    {
        final int EASY      = 1;
        final int MEDIUM    = 2;
        final int HARD      = 3;
        final int GAMBLER   = 4;
        //final int EXIT      = 5; //default

        final int EASY_TRIES    = 20;
        final int MEDIUM_TRIES  = 15;
        final int HARD_TRIES    = 10;

        Random randVal = new Random();
        final int GAMBLER_MIN = 5;
        final int GAMBLER_MAX = 25;
        int triesLeft = 0;

        switch (difficultyLevel)
        {
            case EASY:
                triesLeft = EASY_TRIES;
                break;

           case MEDIUM:
               triesLeft = MEDIUM_TRIES;
                break;

            case HARD:
                triesLeft = HARD_TRIES;
                break;

            case GAMBLER:
                triesLeft = randVal.nextInt(GAMBLER_MIN, GAMBLER_MAX);
                break;

            default:
                System.out.print("\nExiting...\n");
                break;
        }
        return triesLeft;
    }

    public static void gameLogic()
    {
        Scanner input = new Scanner(System.in);

        // Prints A Welcome Message
        printWelcome();

        // Get Game Variables
        int difficultyLevel = getDifficulty();
        final int GAMBLER_DIFFICULTY = 4;
        int triesLeft = getTriesAmount(difficultyLevel);
        int[] randomPasscodeArray = getRandomPasscodeArray();

        // Main Game Logic
        final int MAX_ARRAY_SIZE = 4;
        int inputtedPasscode = 0;
        int[] inputtedPasscodeArray = new int[MAX_ARRAY_SIZE];

        final int CORRECT_PLACE = 2;
        final int CORRECT_DIGIT = 1;

        while(triesLeft > 0)
        {
            // Print Tries Left
            if (difficultyLevel != GAMBLER_DIFFICULTY)
            {
                System.out.print("\n==========\n");
                System.out.printf("Tries Left :\t%d\n", triesLeft);
                System.out.print("==========\n");
            }

            // Get User Inputted Passcode Guess
            do
            {
                System.out.print("\nEnter Passcode : ");
                inputtedPasscode = input.nextInt();
                inputtedPasscodeArray = convertNumberToDigitsArray(inputtedPasscode);
            }
            while (inputtedPasscodeArray == null);

            // Check if has Digit Duplicates
            if (hasSameDigits(inputtedPasscodeArray))
            {
                triesLeft -= 2;
                System.out.print("Inputted Same Digit ! : -2 Tries\n");
                continue;
            }

            // Compares Array's
            int[] checkArray = compareArrays(randomPasscodeArray, inputtedPasscodeArray);
            int correctPlaceCount = 0;
            int correctDigitCount = 0;
            for (int i = 0; i < checkArray.length; i++)
            {
                if(checkArray[i] == CORRECT_PLACE)
                {
                    correctPlaceCount++;
                    System.out.print("[✅] "); // Correct Place
                    //System.out.println(checkArray[i]);
                }
                else if (checkArray[i] == CORRECT_DIGIT)
                {
                    correctDigitCount++;
                    System.out.print("[\uD83D\uDD04] "); // Correct Digit
                    //System.out.println(checkArray[i]);
                }
                else
                {
                    System.out.print("[❌] "); // Incorrect
                    //System.out.println(checkArray[i]);
                }
            }

            triesLeft--;

            if (correctPlaceCount == MAX_ARRAY_SIZE)
            {
                System.out.print("\nCONGRATULATIONS !!! \uD83C\uDF89\n");
                System.out.print("YOU WON !!!\n");
                return;
            }
        }

        System.out.print("\nGAME OVER !\n");
        System.out.print("The Passcode : ");
        for (int i = 0; i < randomPasscodeArray.length; i++)
        {
            System.out.printf("[%d] ",  randomPasscodeArray[i]);
        }
        System.out.println();
    }
    //_____________________________________________________________________________________________
}
