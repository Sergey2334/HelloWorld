package Exam2Tests.Exercises.WebsiteExercises.Exercise8;

public class BankAccountRegular extends BankAccount {
    private static final int regularLimit = Integer.MAX_VALUE;
    private static final int regularMaxOverdraft = 0;

    public BankAccountRegular(int balance)
    {
        super(balance, BankAccountRegular.regularLimit, BankAccountRegular.regularMaxOverdraft); // Non-Limited , Can't Overdraft
    }
}