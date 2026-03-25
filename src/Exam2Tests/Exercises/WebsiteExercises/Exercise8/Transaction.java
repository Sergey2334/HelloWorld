package Exam2Tests.Exercises.WebsiteExercises.Exercise8;

public class Transaction {
    private int id;
    private int amount;
    private String description; // Deposit Or Withdraw

    public Transaction(int id, int amount, String description)
    {
        this.id = id;
        this.amount = amount;
        this.description = description;
    }

    public String toString()
    {
        return this.id + ") " + this.description + ": " + this.amount;
    }
}