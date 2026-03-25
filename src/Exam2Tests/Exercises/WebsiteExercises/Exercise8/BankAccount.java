package Exam2Tests.Exercises.WebsiteExercises.Exercise8;

public abstract class BankAccount implements Transactional , Printable {
    private int balance;
    private int limit; // For Non-Limited Account Make It 0 Or INT_MAX_VAL
    private int maxOverdraft;
    private Transaction[] transactions;

    public BankAccount(int balance, int limit, int maxOverdraft)
    {
        this.balance = balance;
        this.limit = limit;
        this.maxOverdraft = maxOverdraft;
        transactions = new Transaction[]{};
    }

    @Override
    public void deposit(int sum)
    {
        this.balance += sum;
        addTransaction(new Transaction(this.transactions.length + 1, sum, "Deposit"));
    }

    @Override
    public boolean withdraw(int sum)
    {
        boolean result = true;

        int resultBalance = this.balance - sum;

        if (resultBalance < this.maxOverdraft)
        {
            result = false;
            System.out.println("Transaction Denied: Max Overdraft Reached! (Max Overdraft: " + this.maxOverdraft + ")");
        }

        else if (sum > this.limit)
        {
            result = false;
            System.out.println("Transaction Denied: Limit Reached! (Limit: " + this.limit + ")");
        }

        else
        {
            this.balance = resultBalance;
            addTransaction(new Transaction(this.transactions.length + 1, -sum, "Withdraw"));
        }

        return result;
    }

    private void addTransaction(Transaction transactionToAdd)
    {
        Transaction[] newTransactions = new Transaction[this.transactions.length + 1];

        for (int i = 0; i < this.transactions.length; i++)
        {
            newTransactions[i] = this.transactions[i];
        }

        newTransactions[this.transactions.length] = transactionToAdd;

        this.transactions = newTransactions;
    }

    @Override
    public void printBalance()
    {
        System.out.println("Your Balance is " + this.balance + "$ US Dollars");
    }

    @Override
    public void printLastTransaction()
    {
        if (this.transactions.length > 0)
        {
            System.out.println("Your Last Transaction is:\n" + this.transactions[this.transactions.length - 1]);
        }

        else
        {
            System.out.println("No Transactions Found!");
        }
    }
}