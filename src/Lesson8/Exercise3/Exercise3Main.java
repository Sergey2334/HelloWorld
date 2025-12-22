package Lesson8.Exercise3;

public class Exercise3Main {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.printBalance();
        myBankAccount.deposit(100);
        myBankAccount.printBalance();
        myBankAccount.deposit(200);
        myBankAccount.printBalance();
        myBankAccount.deposit(300);
        myBankAccount.printBalance();
        System.out.println(myBankAccount.withdraw(400));
        myBankAccount.printBalance();
    }
}
