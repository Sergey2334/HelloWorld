package Exam2Tests.Exercises.WebsiteExercises.Exercise8;

public class BankAccountOverdraft extends BankAccount {
    private static final int overdraftLimit = Integer.MAX_VALUE;
    private static final int overdraftMaxOverdraft = -10000;

    public BankAccountOverdraft(int balance)
    {
        super(balance, BankAccountOverdraft.overdraftLimit, BankAccountOverdraft.overdraftMaxOverdraft); // Non-Limited , 10000 Overdraft
    }
}