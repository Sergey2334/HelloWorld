package Lesson8.Exercise3;

public class BankAccount {
    private String owner;
    private int  balance;

    public void printBalance() // O(1)
    {
        System.out.printf("Balance: %d\n", balance);
    }

    public void deposit(int amount) // O(1)
    {
        this.balance += amount;
    }

    public boolean withdraw(int amount) // O(1)
    {
        if (this.balance >= amount)
        {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
