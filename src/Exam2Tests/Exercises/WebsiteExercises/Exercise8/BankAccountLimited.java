package Exam2Tests.Exercises.WebsiteExercises.Exercise8;

public class BankAccountLimited extends BankAccount {
    private static final int limitedLimit = 1000;
    private static final int limitedMaxOverdraft = 0;

    public BankAccountLimited(int balance)
    {
        super(balance, BankAccountLimited.limitedLimit, BankAccountLimited.limitedMaxOverdraft); // Limited 1000, Can't Overdraft
    }
}