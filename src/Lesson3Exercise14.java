import java.util.Random;
import java.util.Scanner;

public class Lesson3Exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomVar =  new Random();

        System.out.print("Please enter the amount you want to Bet\n(From 10 - 100 in Multiples of 5)\nBet Amount : ");
        int betAmount = input.nextInt();

        if((betAmount < 10 ||  betAmount > 100) || (betAmount % 5 != 0))
        {
            System.out.println("Invalid Bet Amount");
        }
        else
        {
            int firstLotteryNum = randomVar.nextInt(1, 6);
            int secondLotteryNum = randomVar.nextInt(1, 6);
            int thirdLotteryNum = randomVar.nextInt(1, 6);

            System.out.printf("Lottery Numbers : %d %d %d%n",  firstLotteryNum, secondLotteryNum, thirdLotteryNum);

            if (firstLotteryNum == secondLotteryNum &&  firstLotteryNum == thirdLotteryNum)
            {
                System.out.printf("You WON!!!\nYou Receive %d", betAmount * betAmount);
            }
            else if (firstLotteryNum == secondLotteryNum || firstLotteryNum == thirdLotteryNum || secondLotteryNum == thirdLotteryNum)
            {
                System.out.printf("You WON!!!\nYou Receive %d", betAmount * 2);
            }
            else
            {
                System.out.println("Better Luck Next Time :/");
            }
        }

    }
}
